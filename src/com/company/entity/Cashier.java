package com.company.entity;

/**
 * Created by Hillel6 on 08.06.2017.
 */
public interface Cashier {
    CashierStrategy strategy(Class customerClass);
}
