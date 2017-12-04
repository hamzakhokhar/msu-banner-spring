package com.msubanner.spring.msubannerspring.user;

public interface UserService {
    public AuthUser findByUsername(String username);
    public void save(AuthUser authUser);
}
