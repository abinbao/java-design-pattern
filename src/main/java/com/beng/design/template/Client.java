package com.beng.design.template;

public class Client {
    public static void main(String[] args) {
        AbstraceTemplate a = new DD();

        a.process();
    }
}

class DD extends AbstraceTemplate {

    @Override
    public void b() {
        System.out.println("bbbbb");
    }

}