package com.wenhao.designpatterns.proxy.auto.cglib;

import org.springframework.cglib.proxy.Enhancer;

public class Test {

    public static void main(String[] args) {
        CglibMethodInterceptor cglibMethodInterceptor = new CglibMethodInterceptor();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(OrderServiceImpl.class);
        enhancer.setCallback(cglibMethodInterceptor);
        OrderServiceImpl orderService = (OrderServiceImpl) enhancer.create();
        orderService.order();
    }
}
