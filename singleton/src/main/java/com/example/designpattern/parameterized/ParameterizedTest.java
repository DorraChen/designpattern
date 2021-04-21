package com.example.designpattern.parameterized;

/**
 * @author Dorra
 * @date 2021/4/20 16:02
 * @description 单例支持有参数的构造函数改造的测试
 */
public class ParameterizedTest {
    public static void main(String[] args) {
        // 先init，再使用
        Singleton1.init(10, 50);
        Singleton1 singleton1 = Singleton1.getInstance();
        System.out.println(singleton1.getParamA());
        System.out.println(singleton1.getParamB());

        Singleton2 singleton2 = Singleton2.getInstance(10, 50);
        System.out.println(singleton2.getParamA());
        System.out.println(singleton2.getParamB());
        // 无效的赋值
        Singleton2 singleton21 = Singleton2.getInstance(20, 30);
        System.out.println(singleton21.getParamA());
        System.out.println(singleton21.getParamB());

        Singleton3 singleton3 = Singleton3.getInstance();
        System.out.println(singleton3.getParamA());
        System.out.println(singleton3.getParamB());

    }
}
