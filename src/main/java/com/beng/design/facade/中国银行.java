package com.beng.design.facade;

public interface 中国银行 {
    void bank();
}

class 中国银行海淀分行 implements 中国银行 {

    @Override
    public void bank() {
        System.out.println("办理银行卡");
    }

}