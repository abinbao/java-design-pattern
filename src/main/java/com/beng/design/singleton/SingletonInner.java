package com.beng.design.singleton;

/*
 * 静态内部类实现单例模式
 * 
 *   线程安全并且懒加载
 */
public class SingletonInner {

    private SingletonInner() {

    }

    private static class SingletonInnerClass {
        private static final SingletonInner instance = new SingletonInner();
    }

    public static SingletonInner getInstance() {
        return SingletonInnerClass.instance;
    }
}
