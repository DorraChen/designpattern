package com.example.designpattern.doublecheck;

/**
 * @author dorra
 * @date 2021/3/26 13:49
 * @description 双重检测
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton instance;

    private DoubleCheckSingleton() {
    }

    public static DoubleCheckSingleton getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized (DoubleCheckSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}