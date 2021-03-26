package com.example.designpattern.chapter41.hungry;

/**
 * @author clz
 * @date 2021/3/26 11:37
 * @description 饿汉式
 * 在类加载的时候,instance静态实例就已经创建并初始化好了,所以instance实例的创建过程是线程安全的
 * 不过,这样的实现方式不支持延迟加载
 */
public class Singleton {
    private static final Singleton instance = new Singleton();
    private Singleton() {}
    public static Singleton getInstance() {
        return instance;
    }
}