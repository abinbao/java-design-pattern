package com.beng.design.singleton;

import java.io.Serializable;

/*
 * 懒汉式 单例模式
 * 
 *  延迟加载，真正用的时候才加载
 */
public class SingletonLazy implements Serializable {

    private static SingletonLazy singleton;

    private SingletonLazy() {
        // 防止反射破解单例模式
        // if (singleton != null) {
        // throw new RuntimeException();
        // }
    }

    // 每次调用都要同步
    // 资源利用率高，并发效率低
    public static synchronized SingletonLazy getInstance() {
        if (singleton == null)
            singleton = new SingletonLazy();
        return singleton;
    }

    // 反序列化时，如果定义了 readResolve 方法则直接返回此方法返回的对象，不需要单独再创建对象
    // private Object readResolve() throws ObjectStreamException {
    // return singleton;
    // }

}
