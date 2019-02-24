package com.beng.design.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StarHandler implements InvocationHandler {

    Star star;

    public StarHandler(Star star) {
        super();
        this.star = star;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行方法前...");
        Object obj = null;
        if (method.getName().equals("sing")) {
            obj = method.invoke(star, args);
        }
        System.out.println("执行方法后...");
        return obj;
    }

}
