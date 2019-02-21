package com.beng.design.propertype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试原型模式（深克隆，利用序列化和反序列化）
 * 
 * @author apple
 */
public class Main {
    public static void main(String[] args) throws Exception {

        Date date = new Date();
        Sheep sheep = new Sheep("Dolly", date);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(sheep);
        byte[] bytes = bos.toByteArray();

        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        ObjectInputStream ois = new ObjectInputStream(bis);

        Sheep s1 = (Sheep) ois.readObject();

        System.out.println(sheep);
        System.out.println(sheep.getName() + " " + sheep.getBirthday());
        date.setTime(1550839830L);
        System.out.println(sheep.getBirthday());
        System.out.println(s1);
        System.out.println(s1.getName() + " " + s1.getBirthday());

    }
}
