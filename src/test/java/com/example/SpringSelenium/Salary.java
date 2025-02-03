package com.example.SpringSelenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {


    private int amount;

    /*
    public Salary() {
        this.amount = 1000;
    }

     */

    public int getAmount() {
        return amount;
    }

    @Value("${amount:500}")
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
