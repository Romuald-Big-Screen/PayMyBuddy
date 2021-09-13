package com.PayMyBuddy.demo.service.FORM;

import com.PayMyBuddy.demo.model.Bank;

import java.util.List;

public interface BankService {
    Bank createAccount(Bank bank);

    List<Bank> findAll();

}
