package com.msubanner.spring.msubannerspring.user;
import javax.persistence.*;

@Entity
public class AuthUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String username;
    private String password;
    private boolean active;

    public AuthUser(){}

    public AuthUser(String username, String password, boolean active){
        this.username = username;
        this.password = password;
        this.active = active;
    };


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
