package com.beng.design.singleton;

/*
 * 饿汉式实现单例模式
 * 
 *  1. 构造方法私有化 
 *  2. 类初始化时，立即加载（希望延时加载，即懒汉式）
 */
public class Singleton {

    // 天然的线程安全，调用效率高。
    private static Singleton singleton = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return singleton;
    }

}
