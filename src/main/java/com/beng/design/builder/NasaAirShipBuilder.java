package com.beng.design.builder;

public class NasaAirShipBuilder implements AirShipBuilder {

    @Override
    public Module buildModule() {
        System.out.println("Building Module...");
        return new Module("NASA");
    }

    @Override
    public Engine buildEngine() {
        System.out.println("Building Engine...");
        return new Engine("NASA");
    }

    @Override
    public EscapeTower buildEscapeTower() {
        System.out.println("Building EscapeTower...");
        return new EscapeTower("NASA");
    }

}
