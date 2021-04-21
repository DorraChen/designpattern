package com.example.designpattern.parameterized;

/**
 * @author Dorra
 * @date 2021/4/20 16:00
 * @description 单例支持有参数的构造函数该如何改造?
 * 方式1: init() 函数,在使用这个单例类的时候,要先调用 init() 方法,然后才能调用 getInstance() 方法
 */
public class Singleton1 {
    private static Singleton1 instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton1(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public static Singleton1 getInstance() {
        if (instance == null) {
            throw new RuntimeException("Run init() first.");
        }
        return instance;
    }

    public synchronized static Singleton1 init(int paramA, int paramB) {
        if (instance != null) {
            throw new RuntimeException("Singleton1 has been created!");
        }
        instance = new Singleton1(paramA, paramB);
        return instance;
    }

    public int getParamA() {
        return this.paramA;
    }

    public int getParamB() {
        return this.paramB;
    }
}