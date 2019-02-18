package com.beng.design.factory.abstractFactory;

public interface Engine {

    void run();

    void start();
}

class LuckEngine implements Engine {

    @Override
    public void run() {
        System.out.println("跑的快");
    }

    @Override
    public void start() {
        System.out.println("启动快");
    }

}

class LowEngine implements Engine {

    @Override
    public void run() {
        System.out.println("跑的慢");
    }

    @Override
    public void start() {
        System.out.println("启动慢");
    }

}