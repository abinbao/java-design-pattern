package com.beng.design.factory.method;

public class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }

}
