package com.company.entity.cashiers;

import com.company.entity.Cashier;
import com.company.entity.CashierStrategy;
import com.company.entity.customers.NormalCustomer;
import com.company.entity.strategies.DullStrategy;
import com.company.entity.strategies.FriendlyStrategy;

/**
 * Created by Hillel6 on 12.06.2017.
 */
public class NormalCashier implements Cashier {
    @Override
    public CashierStrategy strategy(Class customerClass) {
        if (customerClass.isAssignableFrom((NormalCustomer.class)))
            return new FriendlyStrategy();
        else
            return new DullStrategy();
    }
}
