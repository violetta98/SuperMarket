package com.company.entity;

import java.util.Random;

/**
 * Created by Hillel6 on 08.06.2017.
 */
public class RandomizedHuman {
    protected final Random random=new Random();
    protected int randomAction() {
        return random.nextInt(15);
    }
}
