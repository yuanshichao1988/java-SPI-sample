package com.ysc.spi.impl;

import com.ysc.spi.HelloService;

public class ChineseHelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "你好, " + name;
    }
}
