package com.wenhao.designpatterns.proxy.auto.jdk;

import com.wenhao.designpatterns.proxy.auto.jdk.impl.OrderServiceImpl;

public class Test {

    public static void main(String[] args) {
        // 从源码中得知，设置这个值，可以把生成的代理类，输出出来。
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = jdkInvocationHandler.getProxy();
        proxy.order();
    }
}
