package com.beng.design.bridge;

public class Client {

    public static void main(String[] args) {
        Computer2 computer = new Desktop2(new Lenovo());
        computer.sale();
        System.out.println("==================");
        Computer2 computer1 = new Laptop2(new Dell());
        computer1.sale();
    }
}
