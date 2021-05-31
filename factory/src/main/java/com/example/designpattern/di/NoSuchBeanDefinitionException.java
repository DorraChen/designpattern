package com.example.designpattern.di;

/**
 * @author dorra
 * @date 2021/5/26 17:36
 * @description
 */
public class NoSuchBeanDefinitionException extends RuntimeException {
    public NoSuchBeanDefinitionException(String message) {
        super(message);
    }
}
