package com.beng.design.bridge;

/**
 * 电脑类型
 * 
 * @author apple
 */
public class Computer2 {

    protected Brand brand;

    public Computer2(Brand brand) {
        this.brand = brand;
    }

    public void sale() {
        brand.sale();
    }
}

class Desktop2 extends Computer2 {

    public Desktop2(Brand brand) {
        super(brand);
    }

    public void sale() {
        super.sale();
        System.out.println("销售台式机...");
    }

}

class Laptop2 extends Computer2 {

    public Laptop2(Brand brand) {
        super(brand);
    }

    public void sale() {
        super.sale();
        System.out.println("销售笔记本...");
    }

}