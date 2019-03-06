package com.beng.design.chain;

public class Client {
    public static void main(String[] args) {

        Leader director = new Director("张三");

        Leader manger = new Manager("李四");

        Leader master = new Master("王五");

        // 责任链关系
        director.setNextLeader(manger);
        manger.setNextLeader(master);

        // 开始处理请假请求
        LevelReq req = new LevelReq("小白", 5, "回家");

        director.handleRequest(req);

    }
}
