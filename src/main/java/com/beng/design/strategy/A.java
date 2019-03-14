package com.beng.design.strategy;

public class A implements Strategy {

    @Override
    public double getPrice(double price) {
        System.out.println("策略 a");
        return price * 0.9;
    }

}
