package com.beng.design.strategy;

public class B implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("策略 b");
        return price * 0.85;
    }

}
