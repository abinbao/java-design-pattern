package com.beng.design.adapter;

/**
 * 客户端类（相当于电脑）类适配器模式
 * 
 * @desc 客户端类想要调用目标类，但是不能直接调用。所以使用适配器，客户端通过调用适配器的方法，适配器可以通过继承或者组合的方式去调用目标类。
 * @author apple
 */
public class Client {

    private void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {

        Client c = new Client();
        Adaptee a = new Adaptee();
        Target adapter = new Adapter2(); // 类适配器

        c.test1(adapter);

        Target t = new Adapter(a); // 组合方式实现适配器
        c.test1(t);

    }
}
