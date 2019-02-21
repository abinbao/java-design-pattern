package com.beng.design.propertype;

import java.util.Date;

/**
 * 测试原型模式（浅克隆）
 * 
 * @author apple
 */
public class Main2 {
    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        Sheep sheep = new Sheep("Dolly", date);
        Sheep s1 = (Sheep) sheep.clone();
        System.out.println(sheep);
        System.out.println(sheep.getName() + " " + sheep.getBirthday());
        date.setTime(1550839830L);
        System.out.println(sheep.getBirthday());
        System.out.println(s1);
        System.out.println(s1.getName() + " " + s1.getBirthday());

    }
}
