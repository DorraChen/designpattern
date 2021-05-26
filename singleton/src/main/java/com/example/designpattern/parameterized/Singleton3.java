package com.example.designpattern.parameterized;

/**
 * @author dorra
 * @date 2021/4/20 16:00
 * @description 单例支持有参数的构造函数该如何改造?
 * 方式3:将参数放到另外一个全局变量中
 */
public class Singleton3 {
    private static Singleton3 instance = null;
    private final int paramA;
    private final int paramB;

    private Singleton3() {
        this.paramA = Config.PARAM_A;
        this.paramB = Config.PARAM_B;
    }

    public synchronized static Singleton3 getInstance() {
        if (instance == null) {
            instance = new Singleton3();
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