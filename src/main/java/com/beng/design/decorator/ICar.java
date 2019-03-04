package com.beng.design.decorator;

/**
 * 抽象组件
 * 
 * @author apple
 */
public interface ICar {
    void move();
}

class Car implements ICar {

    @Override
    public void move() {
        System.out.println("公路上跑");
    }

}

/**
 * 装饰器角色
 * 
 * @author apple
 */
class SuperCar implements ICar {
    ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }

}

class FlyCar extends SuperCar {

    public FlyCar(ICar car) {
        super(car);
    }

    public void fly() {
        System.out.println("天上飞");
    }

    @Override
    public void move() {
        super.move();
        fly();
    }

}

class WaterCar extends SuperCar {

    public WaterCar(ICar car) {
        super(car);
    }

    public void swim() {
        System.out.println("水上游");
    }

    @Override
    public void move() {
        super.move();
        swim();
    }

}