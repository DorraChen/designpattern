package com.example.designpattern.ustatic;

/**
 * @author dorra
 * @date 2021/4/20 17:25
 * @description 静态方法实现的单例如何使用
 */
public class StaticBlockSingletonTest {
    public static void main(String[] args) {
        // 方式1:老的使用方式
        long id = StaticBlockSingleton.getInstance().getId();
        System.out.println(id);

        // 外部调用demofunction()的时候，传入idGenerator
        StaticBlockSingleton idGenerator = StaticBlockSingleton.getInstance();
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        StaticBlockSingleton idGenerator1 = StaticBlockSingleton.getInstance();
        System.out.println(demofunction(idGenerator1));
        System.out.println(demofunction(idGenerator1));
    }

    /**
     * 方式2: 新的使用方式：依赖注入
     *
     * @param singleton
     * @return
     */
    public static long demofunction(StaticBlockSingleton singleton) {
        return singleton.getId();
    }
}
