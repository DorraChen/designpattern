package com.example.designpattern.doublecheck;

/**
 * @author Dorra
 * @date 2021/4/21 15:08
 * @description 双重检测性能优化版本
 * volatile 修饰的变量访问会涉及访问主存储器,而访问主存储器是相当昂贵的.
 * 获取锁定后,将本地参考刷新为最新值,因为此时可变变量可能已更改.
 */
public class DoubleCheckSingletonV2 {
    private static volatile DoubleCheckSingletonV2 instance;

    private DoubleCheckSingletonV2() {
    }

    public static DoubleCheckSingletonV2 getInstance() {
        DoubleCheckSingletonV2 localRef = instance;
        if (localRef == null) {
            synchronized (DoubleCheckSingletonV2.class) {
                // 防止 instance 已经被初始化了，而localRef还是null（多线程，localRef 是方法内的变量）
                localRef = instance;
                if (localRef == null) {
                    instance = localRef = new DoubleCheckSingletonV2();
                }
            }
        }
        return localRef;
    }
}