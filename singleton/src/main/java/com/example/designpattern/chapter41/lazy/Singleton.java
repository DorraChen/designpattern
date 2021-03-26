package com.example.designpattern.chapter41.lazy;

/**
 * @author clz
 * @date 2021/3/26 11:37
 * @description 懒汉式
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
