package com.beng.design.proxy.staticProxy;

/**
 * 静态代理
 * 
 * @author apple
 */
public class Client {
    public static void main(String[] args) {
        Star real = new RealStar();
        Star proxy = new ProxyStar(real);
        proxy.confer();
        proxy.sign();
        proxy.ticket();
        proxy.sing();
        proxy.collect();
    }
}
