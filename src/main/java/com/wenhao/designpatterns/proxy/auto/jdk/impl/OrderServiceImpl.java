package com.wenhao.designpatterns.proxy.auto.jdk.impl;

import com.wenhao.designpatterns.proxy.auto.jdk.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println("下单操作");
    }
}
