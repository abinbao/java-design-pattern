package com.beng.design.builder;

public class NasaAirShipDirector implements AirShipDirector {

    private AirShipBuilder airShipBuilder;

    public NasaAirShipDirector(AirShipBuilder airShipBuilder) {
        this.airShipBuilder = airShipBuilder;
    }

    @Override
    public AirShip directAirShip() {

        Engine engine = airShipBuilder.buildEngine();
        Module module = airShipBuilder.buildModule();
        EscapeTower escapeTower = airShipBuilder.buildEscapeTower();

        AirShip airShip = new AirShip();
        airShip.setEngine(engine);
        airShip.setModule(module);
        airShip.setEscapeTower(escapeTower);

        return airShip;
    }

}
