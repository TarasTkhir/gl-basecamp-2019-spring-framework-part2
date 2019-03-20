package com.services;

import java.util.Random;


public class NumberGenerator {

    private static Random random = new Random();

    private int bound =3;

    public void setBound(int bound) {
        this.bound = bound;
    }

    public int numberGenerator(){

        return random.nextInt(bound);
    }
}
