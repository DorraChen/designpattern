package com.example.designpattern.multiton;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @author dorra
 * @date 2021/4/21 15:52
 * @description 多例模式
 */
public class Multiton {
    private static final ConcurrentHashMap<String, Multiton> instances = new ConcurrentHashMap<>();

    private Multiton() {
    }

    public static Multiton getInstance(String name) {
        instances.putIfAbsent(name, new Multiton());
        return instances.get(name);
    }
}