package com.example.designpattern.parameterized;

/**
 * @author Dorra
 * @date 2021/4/20 16:00
 * @description 单例支持有参数的构造函数该如何改造?
 * 方式3:将参数放到另外一个全局变量中
 */
public class Config {
    public static final int PARAM_A = 123;
    public static final int PARAM_B = 245;
}
