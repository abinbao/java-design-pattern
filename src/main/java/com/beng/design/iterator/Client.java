package com.beng.design.iterator;

public class Client {
    public static void main(String[] args) {

        ConcreteAggregate ca = new ConcreteAggregate();
        ca.addObject("aa");
        ca.addObject("bb");
        ca.addObject("cc");

        MyIterator iter = ca.createIterator();

        while (iter.hasNext()) {
            System.out.println(iter.getCurrentObject());
            iter.next();
        }
    }
}
