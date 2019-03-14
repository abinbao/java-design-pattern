package com.beng.design.strategy;

/**
 * 负责和具体的策略类进行交互
 * 
 * @author apple
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        super();
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double price) {
        System.out.println("当前报价" + this.strategy.getPrice(price));
    }

}
