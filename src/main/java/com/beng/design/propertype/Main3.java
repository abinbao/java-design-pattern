package com.beng.design.propertype;

/**
 * 测试 new 和 clone
 * 
 * @author apple
 */
public class Main3 {
    public static void main(String[] args) throws Exception {

        testNew(1000);
        testClone(1000);
    }

    public static void testNew(int size) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            Desk desk = new Desk();
        }
        long end = System.currentTimeMillis();
        System.out.println("New 创建对象耗时：" + (end - start));
    }

    public static void testClone(int size) throws CloneNotSupportedException {
        long start = System.currentTimeMillis();
        Desk desk = new Desk();
        for (int i = 0; i < size; i++) {
            Desk desk1 = (Desk) desk.clone();
        }
        long end = System.currentTimeMillis();
        System.out.println("Clone 创建对象耗时：" + (end - start));
    }
}

class Desk implements Cloneable {

    public Desk() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.getMessage();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

}