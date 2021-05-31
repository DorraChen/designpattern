package com.example.designpattern.di;

/**
 * @author dorra
 * @date 2021/5/26 17:36
 * @description
 */
public class DiDemo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/config/beans.xml");
        RateLimiter rateLimiter = (RateLimiter) applicationContext.getBean("rateLimiter");
        Boolean isValid = rateLimiter.isValid();
        System.out.println("RateLimiter call isValid method, result: " + isValid);
    }
}
