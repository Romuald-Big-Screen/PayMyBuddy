package com.PayMyBuddy.demo.repository;


import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

import java.util.Optional;

@NoRepositoryBean
public interface CrudRepository<T, ID> extends Repository<T, ID> {
<S extends T> S save(S var1);

<S extends T> Iterable<S> saveAll(Iterable<S> var1);

Optional<T> findById(ID var1);

boolean existsById(ID var1);

Iterable<T> findAll();

Iterable<T> findAllByID(Iterable<ID> var1);

long count();

void deleteById(ID var1);

void delete(T var1);
}
