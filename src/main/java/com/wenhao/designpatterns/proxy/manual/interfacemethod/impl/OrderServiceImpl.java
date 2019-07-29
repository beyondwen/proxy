package com.wenhao.designpatterns.proxy.manual.interfacemethod.impl;

import com.wenhao.designpatterns.proxy.manual.interfacemethod.OrderService;

public class OrderServiceImpl implements OrderService {
    @Override
    public void order() {
        System.out.println("用户下单操作");
    }
}
