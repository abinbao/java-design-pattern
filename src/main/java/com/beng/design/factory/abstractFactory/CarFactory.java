package com.beng.design.factory.abstractFactory;

/**
 * 抽象工厂模式
 * 
 * @author apple
 */
public interface CarFactory {

    Engine createEngine();

    Tyre createTyre();

    Seat createSeat();
}
