package com.beng.design.singleton;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * 测试反射、反序列化破解单例
 * 
 * @author apple
 */
public class Main {

    public static void main(String[] args) throws Exception {

        SingletonLazy instance1 = SingletonLazy.getInstance();
        // SingletonLazy instance2 = SingletonLazy.getInstance();
        //
        System.out.println(instance1);
        // System.out.println(instance2);
        //
        // // 通过反射获取私有构造器
        // Class<SingletonLazy> clz = (Class<SingletonLazy>)
        // Class.forName("com.beng.design.singleton.SingletonLazy");
        // Constructor<SingletonLazy> cons = clz.getDeclaredConstructor(null);
        // cons.setAccessible(true);
        // SingletonLazy instance3 = cons.newInstance();
        // SingletonLazy instance4 = cons.newInstance();
        //
        // System.out.println(instance3);
        // System.out.println(instance4);

        // 通过序列化的方式构造多个对象
        // FileOutputStream fos = new FileOutputStream("a.txt");
        // ObjectOutputStream oos = new ObjectOutputStream(fos);
        // oos.writeObject(instance1);
        // oos.close();
        // fos.close();
        // System.out.println("end");

        ObjectInputStream oin = new ObjectInputStream(new FileInputStream("a.txt"));

        SingletonLazy instance = (SingletonLazy) oin.readObject();
        System.out.println(instance);
    }

}
