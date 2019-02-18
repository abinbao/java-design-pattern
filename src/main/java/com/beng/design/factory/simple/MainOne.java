package com.beng.design.factory.simple;

/**
 * 简单工厂模式
 * 
 * @author apple
 */
public class MainOne {

    public static void main(String[] args) {

        Car audi = CarFactory.createCar("audi");
        Car byd = CarFactory.createCar("byd");

        audi.run();
        byd.run();

    }
}
