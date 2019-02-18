package com.beng.design.factory.abstractFactory;

public interface Tyre {
    void resolve();
}

class LuckTyre implements Tyre {

    @Override
    public void resolve() {
        System.out.println("山地防滑");
    }

}

class LowTyre implements Tyre {

    @Override
    public void resolve() {
        System.out.println("山地不防滑");
    }

}