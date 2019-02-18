package com.beng.design.factory.abstractFactory;

public class LuckCarFactory implements CarFactory {

    @Override
    public Engine createEngine() {
        return new LuckEngine();
    }

    @Override
    public Tyre createTyre() {
        return new LuckTyre();
    }

    @Override
    public Seat createSeat() {
        return new LuckSeat();
    }

}
