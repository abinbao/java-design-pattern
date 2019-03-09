package com.beng.design.mediator;

public class Macket implements Department {

    private Mediatora m;

    public Macket(Mediatora m) {
        super();
        this.m = m;
        m.register("macket", this);
    }

    @Override
    public void selfAction() {
        System.out.println("推销产品...");
    }

    @Override
    public void outAction() {

        System.out.println("汇报工作...");

    }

}
