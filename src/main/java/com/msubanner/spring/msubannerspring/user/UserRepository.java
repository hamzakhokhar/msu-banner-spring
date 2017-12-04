package com.msubanner.spring.msubannerspring.user;


import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<AuthUser, Long> {
    AuthUser findByUsername(String email);
}