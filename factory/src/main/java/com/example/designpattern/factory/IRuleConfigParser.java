package com.example.designpattern.factory;

/**
 * @author dorra
 * @date 2021/4/20 19:31
 * @description
 */
public interface IRuleConfigParser {
    /**
     *
     * @param configText
     * @return
     */
    RuleConfig parse(String configText);
}
