package com.ysc.spi.impl;

import com.ysc.spi.HelloService;

public class EnglishHelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello, " + name;
    }
}
