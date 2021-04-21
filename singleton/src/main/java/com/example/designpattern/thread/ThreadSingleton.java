package com.example.designpattern.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Dorra
 * @date 2021/4/21 10:22
 * @description 如何实现线程唯一的单例？
 */
public class ThreadSingleton {
    private AtomicLong id = new AtomicLong(0);

    private static final ConcurrentHashMap<Long, ThreadSingleton> instances = new ConcurrentHashMap<>();

    private ThreadSingleton() {
    }

    public static ThreadSingleton getInstance() {
        Long currentThreadId = Thread.currentThread().getId();
        instances.putIfAbsent(currentThreadId, new ThreadSingleton());
        return instances.get(currentThreadId);
    }

    public long getId() {
        return id.incrementAndGet();
    }
}
