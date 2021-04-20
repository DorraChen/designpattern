package com.example.designpattern.simplefactory;

import com.example.designpattern.*;
import com.example.designpattern.parser.JsonRuleConfigParser;
import com.example.designpattern.parser.PropertiesRuleConfigParser;
import com.example.designpattern.parser.XmlRuleConfigParser;
import com.example.designpattern.parser.YamlRuleConfigParser;

/**
 * @author Dorra
 * @date 2021/4/20 19:42
 * @description
 */
public class RuleConfigParserFactory {
    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            throw new IllegalArgumentException("configFormat is null");
        }
        IRuleConfigParser parser = null;
        if ("json".equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if ("xml".equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if ("yaml".equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if ("properties".equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }
}
