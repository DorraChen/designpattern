package com.example.designpattern.ustatic;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dorra
 * @date 2021/3/26 15:06
 * @description 利用 Java 的静态内部类
 * 类似饿汉式，但又能做到了延迟加载
 */
public class StaticBlockSingleton {
    private AtomicLong id = new AtomicLong(0);

    private StaticBlockSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticBlockSingleton instance = new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance() {
        return SingletonHolder.instance;
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
