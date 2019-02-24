package com.beng.design.proxy.staticProxy;

/**
 * 代理类
 * 
 * @author apple
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        super();
        this.star = star;
    }

    @Override
    public void confer() {
        System.out.println("ProxyStar.confer()...");
    }

    @Override
    public void sign() {
        System.out.println("ProxyStar.sign()...");
    }

    @Override
    public void ticket() {
        System.out.println("ProxyStar.ticket()...");
    }

    @Override
    public void sing() {
        this.star.sing();
    }

    @Override
    public void collect() {
        System.out.println("ProxyStar.collect()...");
    }

}
