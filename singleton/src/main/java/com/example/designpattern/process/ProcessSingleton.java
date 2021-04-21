package com.example.designpattern.process;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Dorra
 * @date 2021/4/21 10:22
 * @description 如何实现进程间唯一的单例？
 */
public class ProcessSingleton {
    private AtomicLong id = new AtomicLong(0);
    private static ProcessSingleton instance;
    private static SharedObjectStorage storage = FileSharedObjectStorage(/*入参省略，比如文件地址*/);

    private static SharedObjectStorage FileSharedObjectStorage() {
        return null;
    }

    private static DistributedLock lock = new DistributedLock();

    private ProcessSingleton() {
    }

    public synchronized static ProcessSingleton getInstance() {
        if (instance == null) {
            lock.lock();
            instance = storage.load(ProcessSingleton.class);
        }
        return instance;
    }

    public synchronized void freeInstance() {
        storage.save(this, ProcessSingleton.class);
        instance = null;
        //释放对象
        lock.unlock();
    }

    public long getId() {
        return id.incrementAndGet();
    }

    private static class DistributedLock {
        /**
         * 分布式锁
         */
        public void lock() {

        }

        public void unlock() {

        }
    }

    private static class SharedObjectStorage {
        public ProcessSingleton load(Class<ProcessSingleton> processSingletonClass) {
            return null;
        }

        public void save(ProcessSingleton processSingleton, Class<ProcessSingleton> processSingletonClass) {

        }
    }
}
