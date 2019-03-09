package com.beng.design.mediator;

/**
 * 部门
 * 
 * @author apple
 */
public interface Department {

    void selfAction(); // 做本部门的事情

    void outAction(); // 向总经理发送请求
}
