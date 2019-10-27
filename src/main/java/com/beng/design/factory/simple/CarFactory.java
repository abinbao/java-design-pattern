package com.beng.design.factory.simple;

/**
 * 简单工厂模式（违反开闭原则）
 */
public class CarFactory {

    private CarFactory() {

    }

    public static Car createCar(String type) {
        if ("audi".equals(type)) {
            return createAudi();
        } else if ("byd".equals(type)) {
            return createByd();
        } else {
            return null;
        }
    }

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }

}
