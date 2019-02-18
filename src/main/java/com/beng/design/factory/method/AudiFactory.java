package com.beng.design.factory.method;

public class AudiFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Audi();
    }

}
