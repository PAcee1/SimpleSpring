package com.enbuys.test;

import com.enbuys.simpleIOC.SimpleIOC;
import com.enbuys.pojo.Car;
import com.enbuys.pojo.Wheel;
import org.junit.Test;

/**
 * @Author: Pace
 * @Data: 2019/3/22 14:33
 * @Version: v1.0
 */
public class SimpleIOCTest {
    @Test
    public void getBean() throws Exception {
        String location = SimpleIOC.class.getClassLoader().getResource("spring-test.xml").getFile();
        SimpleIOC bf = new SimpleIOC(location);
        Wheel wheel = (Wheel) bf.getBean("wheel");
        System.out.println(wheel);
        Car car = (Car) bf.getBean("car");
        System.out.println(car);
    }
}
