package com.beng.design.factory.abstractFactory;

public interface Seat {

    void release();
}

class LuckSeat implements Seat {

    @Override
    public void release() {
        System.out.println("高端软座椅");
    }

}

class LowSeat implements Seat {

    @Override
    public void release() {
        System.out.println("低端应座椅");
    }

}
