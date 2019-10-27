package com.beng.design.factory.abstractFactory;

/**
 * 抽象工厂模式
 */
public class Main {

    public static void main(String[] args) {
        CarFactory factory = new LuckCarFactory();
        Engine engine = factory.createEngine();
        engine.start();
        engine.run();
    }

}
