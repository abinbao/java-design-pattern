package com.beng.design.facade;

public class 客户端 {

    public static void main(String[] args) {
        客户端 客户_1 = new 客户端();
        客户_1.说话();
    }

    public void 说话() {
        System.out.println("你好");
    }
}
