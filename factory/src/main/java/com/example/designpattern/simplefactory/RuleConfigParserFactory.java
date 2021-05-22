package com.example.designpattern.simplefactory;

import com.example.designpattern.*;
import com.example.designpattern.parser.JsonRuleConfigParser;
import com.example.designpattern.parser.PropertiesRuleConfigParser;
import com.example.designpattern.parser.XmlRuleConfigParser;
import com.example.designpattern.parser.YamlRuleConfigParser;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Dorra
 * @date 2021/4/20 19:42
 * @description 简单工厂模式
 */
public class RuleConfigParserFactory {
    private static final Map<String, IRuleConfigParser> cachedParses = new HashMap<>();

    static {
        putCachedParses(SourceConstants.JSON, new JsonRuleConfigParser());
        putCachedParses(SourceConstants.XML, new XmlRuleConfigParser());
        putCachedParses(SourceConstants.YAML, new YamlRuleConfigParser());
        putCachedParses(SourceConstants.PROPERTIES, new PropertiesRuleConfigParser());
    }

    private static void putCachedParses(String fileExtension, IRuleConfigParser parser) {
        cachedParses.put(fileExtension, parser);
    }

    public static IRuleConfigParser createParser(String configFormat) {
        if (configFormat == null || configFormat.isEmpty()) {
            throw new IllegalArgumentException("configFormat is null");
        }
        IRuleConfigParser parser = cachedParses.get(configFormat);
        return parser;
    }
}
