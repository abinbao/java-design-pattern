package com.beng.design.decorator;

public class Client {

    public static void main(String[] args) {

        ICar car = new Car();
        car.move();
        // 增加飞行功能
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();
        // 增加水上功能
        WaterCar waterCar = new WaterCar(flyCar);
        waterCar.move();
    }
}
