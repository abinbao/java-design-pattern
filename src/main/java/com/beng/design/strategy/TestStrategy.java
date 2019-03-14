package com.beng.design.strategy;

/**
 * 不符合开闭原则
 * 
 * @author apple
 */
public class TestStrategy {

    public double getPrice(String type, double price) {

        if (type.equals("a")) {
            System.out.println("策略 a");
            return price * 0.9;
        } else if (type.equals("b")) {
            System.out.println("策略 b");
            return price * 0.85;
        } else if (type.equals("c")) {
            System.out.println("策略 c");
            return price * 0.8;
        } else {
            System.out.println("策略 d");
        }
        return price;
    }
}
