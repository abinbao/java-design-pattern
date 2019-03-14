package com.beng.design.strategy;

public class Client {
    public static void main(String[] args) {
        Strategy s1 = new A();
        Context c = new Context(s1);
        c.printPrice(10);
    }
}
