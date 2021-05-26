package com.example.designpattern.factory;

/**
 * @author dorra
 * @date 2021/5/26 13:38
 * @description
 */
public class XmlRuleConfigParserFactory implements IRuleConfigParserFactory {
    @Override
    public IRuleConfigParser createParser() {
        return new XmlRuleConfigParser();
    }
}
