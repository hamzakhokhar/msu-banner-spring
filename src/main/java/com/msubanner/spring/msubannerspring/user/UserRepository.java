package com.msubanner.spring.msubannerspring.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository <User, Long> {
    User findByUsername(String email);
}
