package com.beng.design.singleton;

/*
 * 双重检测锁模式
 */
public class SingletonLock {

    private static SingletonLock singleton;

    private SingletonLock() {

    }

    public static SingletonLock getInstance() {
        if (singleton == null) {
            SingletonLock sl;
            synchronized (SingletonLock.class) {
                sl = singleton;
                if (sl == null) {
                    synchronized (SingletonLock.class) {
                        if (sl == null) {
                            sl = new SingletonLock();
                        }
                    }
                    singleton = sl;
                }
            }
        }
        return singleton;
    }
}
