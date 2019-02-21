package com.beng.design.propertype;

import java.util.Date;

/**
 * 原型模式(深复制)
 * 
 * @author apple
 */
public class MainOne {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        SheepOne sheep = new SheepOne("Dolly", date);
        SheepOne s1 = (SheepOne) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep.getName() + " " + sheep.getBirthday());
        date.setTime(1550839830L);
        System.out.println(sheep.getBirthday());
        System.out.println(s1);
        System.out.println(s1.getName() + " " + s1.getBirthday());
    }
}
