package com.ysc.spi;

import org.junit.Test;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * Unit test for simple App.
 */
public class SpiTest
{
    /**O
     * Rigorous Test :-)
     */
    @Test
    public void spiTest() {
        ServiceLoader<HelloService> serviceLoader = ServiceLoader.load(HelloService.class);
        Iterator<HelloService> iterator = serviceLoader.iterator();
        while (iterator.hasNext()) {
            HelloService helloService = iterator.next();
            System.out.println("Class" + helloService.getClass().getName() + " --> " + helloService.sayHello("LiMing"));
        }
    }

}
