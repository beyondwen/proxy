package com.wenhao.designpatterns.proxy.auto.jdk;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

import java.lang.reflect.Method;

public class JdkInvocationHandler implements InvocationHandler {

    public Object target;

    public JdkInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println("自动代理日志采集开始");
        Object invoke = method.invoke(target, objects);
        System.out.println("自动代理日志采集结束");
        return invoke;
    }

    public <T> T getProxy() {
        return (T) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this::invoke);
    }
}
