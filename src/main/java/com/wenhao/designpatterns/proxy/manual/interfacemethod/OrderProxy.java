package com.wenhao.designpatterns.proxy.manual.interfacemethod;

public class OrderProxy implements OrderService {

    private OrderService proxiesOrderService;

    public OrderProxy(OrderService proxiesOrderService) {
        this.proxiesOrderService = proxiesOrderService;
    }

    @Override
    public void order() {
        System.out.println("日志采集开始");
        proxiesOrderService.order();
        System.out.println("日志采集结束");
    }
}
