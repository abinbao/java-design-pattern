package com.beng.design.template;

public abstract class AbstraceTemplate {

    public void a() {
        System.out.println("aaaaa");
    }

    public void c() {
        System.out.println("ccccc");
    }

    public abstract void b();

    public void process() {
        this.a();
        this.b();
        this.c();
    }

}
