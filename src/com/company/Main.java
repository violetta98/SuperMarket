package com.company;

//import com.company.entity.cashiers.RandomizedCashier;
import com.company.entity.Customer;
import com.company.entity.cashiers.LazyCashier;
import com.company.entity.cashiers.NormalCashier;
import com.company.entity.customers.RandomizedCustomer;
import com.company.entity.Register;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//        String string="jfdkjgi";
//        System.out.println(string.getClass());
        Register register = new Register(new LazyCashier());
        register.newCustomer(new AnotherCustomer());
        register.newCustomer();
        register.run();
    }

    private static Customer randomCustomer() {
        if (new Random.nextBoolean())
            return new RandomizedCustomer();
        else
            return new AnotherCustomer();
    }
}
