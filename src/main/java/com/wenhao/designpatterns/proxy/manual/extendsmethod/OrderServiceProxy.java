package com.wenhao.designpatterns.proxy.manual.extendsmethod;

import com.wenhao.designpatterns.proxy.manual.interfacemethod.impl.OrderServiceImpl;

public class OrderServiceProxy extends OrderServiceImpl {

    @Override
    public void order() {
        System.out.println("日志采集开始");
        super.order();
        System.out.println("日志采集结束");
    }
}
