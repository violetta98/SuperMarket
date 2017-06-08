package com.company.entity;

/**
 * Created by Hillel6 on 08.06.2017.
 */
public class RandomizedCustomer extends RandomizedHuman implements Customer {

    @Override
    public int putGoodsOnTheLine() {
        return randomAction();
    }

    @Override
    public int passMoneyToCashier() {
        return randomAction();
    }

    @Override
    public int payForGoods() {
        return randomAction();
    }
}
