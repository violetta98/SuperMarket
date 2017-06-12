package com.company.entity.customers;

import com.company.entity.Customer;
import com.company.entity.RandomizedHuman;

/**
 * Created by Hillel6 on 08.06.2017.
 */
public class RandomizedCustomer extends RandomizedHuman implements Customer {

    @Override
    public int buyThings() {
        return randomAction();
    }
}
