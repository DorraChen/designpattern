package com.example.designpattern.factory;

/**
 * @author dorra
 * @date 2021/5/26 13:41
 * @description
 */
public class YamlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new YamlRuleConfigParser();
    }
}
