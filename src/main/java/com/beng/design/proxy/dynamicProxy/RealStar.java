package com.beng.design.proxy.dynamicProxy;

public class RealStar implements Star {

    @Override
    public void confer() {
        System.out.println("RealStar.confer()...");
    }

    @Override
    public void sign() {
        System.out.println("RealStar.sign()...");
    }

    @Override
    public void ticket() {
        System.out.println("RealStar.ticket()...");
    }

    @Override
    public void sing() {
        System.out.println("RealStar(Jay).sing()...");
    }

    @Override
    public void collect() {
        System.out.println("RealStar.collect()...");
    }

}
