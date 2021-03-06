package com.example.designpattern.hungry;

/**
 * @author dorra
 * @date 2021/3/26 11:37
 * @description 饿汉式
 * 在类加载的时候,instance静态实例就已经创建并初始化好了,所以instance实例的创建过程是线程安全的
 * 不过,这样的实现方式不支持延迟加载
 */
public class HungrySingleton {
    private static final HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}