package io.github.pedroermarinho.hamburgueria.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import io.github.pedroermarinho.hamburgueria.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {


    @Autowired
    private DBService dbService;
    
    @Bean
    public boolean instantiateDatabase(){
        dbService.instantiateTestDataBase();
        return true;
    }
}
