package com.beng.design.adapter;

/**
 * 适配器（相当于usb和 ps2的转接器）使用组合的方式跟适配对象整合
 * 
 * @author apple
 */
public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }

}
