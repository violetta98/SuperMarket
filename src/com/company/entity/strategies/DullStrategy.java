package com.company.entity.strategies;

import com.company.entity.CashierStrategy;
import com.company.entity.Customer;

/**
 * Created by Hillel6 on 12.06.2017.
 */
public class DullStrategy implements CashierStrategy {
    public static final int DULL_COEFFICIENT=2;
    @Override
    public int communicate(Customer customer) {
        System.out.println("It is ");
        return customer.buyThings()+DULL_COEFFICIENT;
    }
}
