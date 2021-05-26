package com.example.designpattern.factory;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dorra
 * @date 2021/5/26 16:36
 * @description 简单工厂
 */
public class RuleConfigParserFactorySimple {
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
        if (StringUtils.isEmpty(configFormat)) {
            return null;
        }
        IRuleConfigParser parser = cachedParses.get(configFormat);
        return parser;
    }
}
