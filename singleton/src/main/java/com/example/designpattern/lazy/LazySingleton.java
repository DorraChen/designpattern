package com.example.designpattern.lazy;

/**
 * @author dorra
 * @date 2021/3/26 11:37
 * @description 懒汉式
 */
public class LazySingleton {
    private static LazySingleton instance;
    private LazySingleton() {}
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
