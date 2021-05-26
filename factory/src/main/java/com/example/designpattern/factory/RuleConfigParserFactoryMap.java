package com.example.designpattern.factory;

import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dorra
 * @date 2021/4/20 19:42
 * @description 工厂方法
 */
public class RuleConfigParserFactoryMap {
    private static final Map<String, IRuleConfigParserFactory> cachedFactories = new HashMap<>();

    static {
        putCachedFactories(SourceConstants.JSON, new JsonRuleConfigParserFactory());
        putCachedFactories(SourceConstants.XML, new XmlRuleConfigParserFactory());
        putCachedFactories(SourceConstants.YAML, new YamlRuleConfigParserFactory());
        putCachedFactories(SourceConstants.PROPERTIES, new PropertiesRuleConfigParserFactory());
    }

    private static void putCachedFactories(String fileExtension, IRuleConfigParserFactory parser) {
        cachedFactories.put(fileExtension, parser);
    }

    public static IRuleConfigParserFactory createParser(String configFormat) {
        if (StringUtils.isEmpty(configFormat)) {
            return null;
        }
        return cachedFactories.get(configFormat);
    }
}
