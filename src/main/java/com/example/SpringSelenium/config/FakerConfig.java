package com.example.SpringSelenium.config;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }

}
