package com.example.designpattern.chapter41.lazy;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author clz
 * @date 2021/3/26 11:37
 * @description 懒汉式
 */
public class IdGenerator {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator instance;
    private IdGenerator() {}
    public static synchronized IdGenerator getInstance() {
        if (instance == null) {
            instance = new IdGenerator();
        }
        return instance;
    }
    public long getId() {
        return id.incrementAndGet();
    }
}
