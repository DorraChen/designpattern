package com.example.designpattern.di;

/**
 * @author dorra
 * @date 2021/5/26 17:30
 * @description
 */
public interface ApplicationContext {
    Object getBean(String beanId);
}
