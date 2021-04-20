package com.example.designpattern.ustatic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dorra
 * @date 2021/3/26 15:06
 * @description 利用 Java 的静态内部类
 * 类似饿汉式，但又能做到了延迟加载
 */
public class Singleton {
    private AtomicLong id = new AtomicLong(0);

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton instance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
