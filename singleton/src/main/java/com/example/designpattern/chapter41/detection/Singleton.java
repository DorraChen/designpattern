package com.example.designpattern.chapter41.detection;

/**
 * @author clz
 * @date 2021/3/26 13:49
 * @description 双重检测
 */
public class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized(Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}