package com.PayMyBuddy.demo.configuration;


import com.PayMyBuddy.demo.service.UserService;
import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.logging.Logger;

@Component
public class LoggingAccessDeniedHandler implements AccessDeniedHandler {
    private static Logger log = (Logger) LoggerFactory.getLogger(LoggingAccessDeniedHandler.class);

    @Autowired
    private UserService userService;

    @Override
    public void handle(HttpServletRequest request,
                       HttpServletResponse response,
                       AccessDeniedException ex) throws IOException, ServletException {

        UserDetails userDetails = userService.loadUserByUsername("name");
        Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null) {
            log.info(auth.getName()
                    + " was trying to access protected resource: "
                    + request.getRequestURI());
        }

        response.sendRedirect(request.getContextPath() + "/access-denied");

    }
}
