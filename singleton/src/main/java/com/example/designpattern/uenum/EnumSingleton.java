package com.example.designpattern.uenum;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author dorra
 * @date 2021/3/26 15:06
 * @description 基于枚举类型的单例实现
 * 通过 Java 枚举类型本身的特性，保证了实例创建的线程安全性和实例的唯一性
 */
public enum EnumSingleton {
    /**
     * 单例
     */
    INSTANCE;
    private AtomicLong id = new AtomicLong(0);

    public long getId() {
        return id.incrementAndGet();
    }
}
