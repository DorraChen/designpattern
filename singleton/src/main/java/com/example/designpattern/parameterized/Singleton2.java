package com.example.designpattern.parameterized;

/**
 * @author Dorra
 * @date 2021/4/20 16:00
 * @description 单例支持有参数的构造函数该如何改造?
 * 方式2:将参数放到 getIntance() 方法中, 但是这样实现只允许赋值一次, 第二次赋值无效
 */
public class Singleton2 {
    private static Singleton2 instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton2(int paramA, int paramB) {
        this.paramA = paramA;
        this.paramB = paramB;
    }

    public synchronized static Singleton2 getInstance(int paramA, int paramB) {
        if (instance == null) {
            instance = new Singleton2(paramA, paramB);
        }
        return instance;
    }

    public int getParamA() {
        return this.paramA;
    }

    public int getParamB() {
        return this.paramB;
    }
}