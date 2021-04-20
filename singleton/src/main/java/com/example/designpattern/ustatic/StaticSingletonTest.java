package com.example.designpattern.ustatic;

/**
 * @author Dorra
 * @date 2021/4/20 17:25
 * @description 静态方法实现的单例如何使用
 */
public class StaticSingletonTest {
    public static void main(String[] args) {
        // 方式1:老的使用方式
        long id = Singleton.getInstance().getId();
        System.out.println(id);

        // 外部调用demofunction()的时候，传入idGenerator
        Singleton idGenerator = Singleton.getInstance();
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        System.out.println(demofunction(idGenerator));
        Singleton idGenerator1 = Singleton.getInstance();
        System.out.println(demofunction(idGenerator1));
        System.out.println(demofunction(idGenerator1));
    }

    /**
     * 方式2: 新的使用方式：依赖注入
     *
     * @param idGenerator
     * @return
     */
    public static long demofunction(Singleton idGenerator) {
        return idGenerator.getId();
    }
}
