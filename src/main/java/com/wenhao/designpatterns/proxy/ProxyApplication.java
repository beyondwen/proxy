package com.wenhao.designpatterns.proxy;

import com.wenhao.designpatterns.proxy.auto.jdk.JdkInvocationHandler;
import com.wenhao.designpatterns.proxy.auto.jdk.OrderService;
import com.wenhao.designpatterns.proxy.auto.jdk.impl.OrderServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProxyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProxyApplication.class, args);
//        /**
//         * 接口方式代理
//         */
//        OrderService orderService = new OrderProxy(new OrderServiceImpl());
//        orderService.order();
//
//        /**
//         * 继承方式代理
//         */
//        orderService = new OrderServiceProxy();
//        orderService.order();

        /**
         * jdk 动态代理
         */
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        JdkInvocationHandler jdkInvocationHandler = new JdkInvocationHandler(new OrderServiceImpl());
        OrderService proxy = jdkInvocationHandler.getProxy();
        proxy.order();
    }

}
