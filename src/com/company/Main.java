package com.company;

//import com.company.entity.cashiers.RandomizedCashier;
import com.company.entity.Cashier;
import com.company.entity.Customer;
import com.company.entity.cashiers.LazyCashier;
import com.company.entity.cashiers.NormalCashier;
import com.company.entity.customers.RandomizedAgressiveCustomer;
import com.company.entity.customers.RandomizedLazyCustomer;
import com.company.entity.customers.RandomizedNormalCustomer;
import com.company.entity.Register;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main m = new Main();
        for (int i=0; i<100000; i++)
             new Thread(m.newRegister()).start();
//        ExecutorService pool = Executors.newCachedThreadPool(new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread thread = new Thread(r);
//                thread.setName("lol");
//                thread.setPriority(342);
//                return thread;
//            }
//        });
        ExecutorService pool = Executors.newFixedThreadPool(5); // надо остановить executor
        for (int i=0; i<5; i++) {
            pool.submit(m.newRegister());
        }
        pool.shutdown();
        // register.run();
        // Thread.currentThread().sleep(1);
        System.out.println("all done");
    }

    private Cashier randomCashier() {
       if (new Random().nextBoolean())
           return new LazyCashier(); // садим в кассу ленивого кассира
       else
           return new NormalCashier(); // садим в кассу нормального кассира
    }

    private Customer randomCustomer() {
        int q=new Random().nextInt(3);
        if (q==0)
            return new RandomizedNormalCustomer(); // добавляем нормального покупателя в очередь
        else if (q==1)
            return new RandomizedLazyCustomer();  // добавляем ленивого покупателя в очередь
        else
            return new RandomizedAgressiveCustomer();
    }

    private Register newRegister() {
        Register register = new Register(randomCashier()); // садим в кассу рандомного кассира
        for (int i=0; i<new Random().nextInt(15); i++)
            register.newCustomer(randomCustomer()); // добавляет в очередь рандомного покупателя
        return register;
    }
}
