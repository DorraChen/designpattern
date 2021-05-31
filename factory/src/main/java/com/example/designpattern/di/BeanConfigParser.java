package com.example.designpattern.di;

import java.io.InputStream;
import java.util.List;

/**
 * @author dorra
 * @date 2021/5/26 17:31
 * @description
 */
public interface BeanConfigParser {
    List<BeanDefinition> parse(InputStream inputStream);
}
