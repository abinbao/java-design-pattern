package com.beng.design.factory.method;

/**
 * 工厂方法模式（将行为抽象，将创建车的行为抽象）
 * 
 * @author apple
 */
public class Main {

    public static void main(String[] args) {

        // 面向接口编程
        Car audi = new AudiFactory().createCar();
        Car byd = new BydFactory().createCar();

        audi.run();
        byd.run();

    }
}
