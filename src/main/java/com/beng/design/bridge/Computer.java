package com.beng.design.bridge;

/**
 * 未使用桥接模式，每新添加类型就要新的类
 * 
 * @author apple
 */
public interface Computer {

    void sale();

}

class Desktop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售台式机..");
    }

}

class Laptop implements Computer {

    @Override
    public void sale() {
        System.out.println("销售笔记本..");
    }

}

class Ipad implements Computer {

    @Override
    public void sale() {
        System.out.println("销售平板..");
    }

}

class LenovoDesktop extends Desktop {
    @Override
    public void sale() {
        System.out.println("销售联想台式机..");
    }
}

class LenovoLaptop extends Laptop {
    @Override
    public void sale() {
        System.out.println("销售联想笔记本..");
    }
}

class LenovoIpad extends Ipad {
    @Override
    public void sale() {
        System.out.println("销售联想平板..");
    }
}