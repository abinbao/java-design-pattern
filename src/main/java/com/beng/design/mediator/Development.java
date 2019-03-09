package com.beng.design.mediator;

public class Development implements Department {

    private Mediatora m;

    public Development(Mediatora m) {
        super();
        this.m = m;
        m.register("development", this);
    }

    @Override
    public void selfAction() {
        System.out.println("内部研发...");
    }

    @Override
    public void outAction() {

        System.out.println("汇报工作...");

    }

}
