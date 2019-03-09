package com.beng.design.mediator;

public class Finacial implements Department {

    private Mediatora m;

    public Finacial(Mediatora m) {
        super();
        this.m = m;
        m.register("finacial", this);
    }

    @Override
    public void selfAction() {
        System.out.println("发工资...");
    }

    @Override
    public void outAction() {

        System.out.println("汇报工作...");

    }

}
