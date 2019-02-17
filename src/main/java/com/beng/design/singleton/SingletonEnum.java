package com.beng.design.singleton;

/*
 * 枚举实现单例
 */
public enum SingletonEnum {

    // 枚举元素，本身就是单例对象，没有懒加载
    INSTANCE;

    public void getInstance() {

    }
}
