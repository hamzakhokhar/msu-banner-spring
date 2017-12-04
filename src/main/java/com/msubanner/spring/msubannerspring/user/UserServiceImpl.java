package com.msubanner.spring.msubannerspring.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service("userService")
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public AuthUser findByUsername(String email) {
        return userRepository.findByUsername(email);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        AuthUser authUser = userRepository.findByUsername(userName);
//        List<GrantedAuthority> authorities = getUserAuthority(authUser.getRoles());
        return new org.springframework.security.core.userdetails.User(authUser.getUsername(), authUser.getPassword(), true, true, true, true, new ArrayList<>());
    }

    @Override
    public void save(AuthUser authUser) {
        authUser.setPassword(bCryptPasswordEncoder.encode(authUser.getPassword()));

//        Role userRole = roleRepository.findByRole("ADMIN");
//        authUser.setRoles(new HashSet<Role>(Arrays.asList(userRole)));
        userRepository.save(authUser);
    }



}
