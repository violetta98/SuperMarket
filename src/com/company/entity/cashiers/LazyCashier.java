package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;

/**
 * Created by Hillel6 on 12.06.2017.
 */
public class LazyCashier implements Cashier {

    @Override
    public CashierStrategy strategy(Class customerClass) {
        return null;
    }
}
