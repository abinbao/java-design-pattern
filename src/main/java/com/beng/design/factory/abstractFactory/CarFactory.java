package com.beng.design.factory.abstractFactory;

public interface CarFactory {

    Engine createEngine();

    Tyre createTyre();

    Seat createSeat();
}
