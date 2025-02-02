package com.example.SpringSelenium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    //Constructor ve setter yerine , field Autowired da yapilabilir.
    @Autowired
    private Adress adress;

    @Autowired
    private Salary salary;

    /*
    public User(Adress adress, Salary salary) {
        this.adress = adress;
        this.salary = salary;
    }

     */

    //Constructor a alternatif olarak setter methodu @Autowired ile kullanilabilir.
    /*
    @Autowired
    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

     */
    public void printDetails() {
        System.out.println("Adress : " +this.adress.getStreet());
        System.out.println("Salary : " +this.salary.getAmount());
    }
}

