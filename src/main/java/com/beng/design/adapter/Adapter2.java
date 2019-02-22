package com.beng.design.adapter;

/**
 * 适配器（相当于usb和 ps2的转接器）
 * 
 * @author apple
 */
public class Adapter2 extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }

}
