package com.beng.design.builder;

public class Main {

    public static void main(String[] args) {
        AirShipDirector airShipDirector = new NasaAirShipDirector(new NasaAirShipBuilder());

        AirShip airShip = airShipDirector.directAirShip();

        System.out.println(airShip.getEngine().getName());
    }
}
