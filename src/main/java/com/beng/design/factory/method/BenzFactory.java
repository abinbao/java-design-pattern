package com.beng.design.factory.method;

public class BenzFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Benz();
    }

}
