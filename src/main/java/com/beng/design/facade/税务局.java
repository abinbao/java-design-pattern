package com.beng.design.facade;

public interface 税务局 {
    void tax();
}

class 海淀税务局 implements 税务局 {

    @Override
    public void tax() {
        System.out.println("办理税务");
    }

}
