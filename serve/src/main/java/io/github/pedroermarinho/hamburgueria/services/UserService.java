package io.github.pedroermarinho.hamburgueria.services;

import org.springframework.security.core.context.SecurityContextHolder;

import io.github.pedroermarinho.hamburgueria.security.UserSS;

public class UserService {
    

    public static UserSS authenticated(){
        try{
            return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        }catch(Exception e){
            return null;
        }
    }
}
