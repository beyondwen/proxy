package com.wenhao.designpatterns.proxy.auto.cglib;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;


public class CglibMethodInterceptor implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib 日志收集开始");
        Object result = methodProxy.invokeSuper(o, objects);
        System.out.println("cglib 日志收集结束");
        return result;
    }
}
