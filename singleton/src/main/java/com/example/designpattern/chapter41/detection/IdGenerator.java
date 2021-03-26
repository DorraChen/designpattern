package com.example.designpattern.chapter41.detection;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author clz
 * @date 2021/3/26 13:49
 * @description 双重检测
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static IdGenerator getInstance() {
        if (instance == null) {
            // 此处为类级别的锁
            synchronized(IdGenerator.class) {
                if (instance == null) {
                    instance = new IdGenerator();
                }
            }
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}