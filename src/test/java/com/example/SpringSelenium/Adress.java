package com.example.SpringSelenium;

import org.springframework.stereotype.Component;

@Component
public class Adress {

    private String street;

    public Adress() {
        this.street = "123 non main st";
    }

    public String getStreet() {
        return street;
    }
}
