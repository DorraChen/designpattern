package com.example.designpattern.factory;

/**
 * @author dorra
 * @date 2021/5/26 13:35
 * @description
 */
public class JsonRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new JsonRuleConfigParser();
    }
}
