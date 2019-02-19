package com.beng.design.builder;

public class AirShip {

    private Module module;
    private Engine engine;
    private EscapeTower escapeTower;

    public void launch() {
        System.out.println("启动飞船...");
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public EscapeTower getEscapeTower() {
        return escapeTower;
    }

    public void setEscapeTower(EscapeTower escapeTower) {
        this.escapeTower = escapeTower;
    }

    @Override
    public String toString() {
        return "AirShip [module=" + module + ", engine=" + engine + ", escapeTower=" + escapeTower + "]";
    }

}

class Module {

    private String name;

    public Module(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Engine {

    private String name;

    public Engine(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class EscapeTower {

    private String name;

    public EscapeTower(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
