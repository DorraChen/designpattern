package com.example.designpattern.factory;

import org.springframework.util.StringUtils;

/**
 * @author dorra
 * @date 2021/4/20 19:29
 * @description
 */
public class RuleConfigSource {

    public RuleConfig load(String ruleConfigFilePath) {
        String ruleConfigFileExtension = getFileExtension(ruleConfigFilePath);
        IRuleConfigParser parser = createParserA(ruleConfigFileExtension);
        if (parser == null) {
            throw new InvalidRuleConfigException("Rule config file format is not supported: " + ruleConfigFilePath);
        }

        String configText = "";
        //从ruleConfigFilePath文件中读取配置文本到configText中
        RuleConfig ruleConfig = parser.parse(configText);
        return ruleConfig;
    }

    private String getFileExtension(String filePath) {
        String extension = "";
        //...解析文件名获取扩展名，比如rule.json，返回json
        int index = filePath.lastIndexOf(".");
        if (index > 0) {
            extension = filePath.substring(index + 1);
        }
        return extension;
    }

    /**
     * 简单工厂
     *
     * @param configFormat
     * @return
     */
    private IRuleConfigParser createParserA(String configFormat) {
        if (StringUtils.isEmpty(configFormat)) {
            return null;
        }
        IRuleConfigParser parser = null;
        if (SourceConstants.JSON.equalsIgnoreCase(configFormat)) {
            parser = new JsonRuleConfigParser();
        } else if (SourceConstants.XML.equalsIgnoreCase(configFormat)) {
            parser = new XmlRuleConfigParser();
        } else if (SourceConstants.YAML.equalsIgnoreCase(configFormat)) {
            parser = new YamlRuleConfigParser();
        } else if (SourceConstants.PROPERTIES.equalsIgnoreCase(configFormat)) {
            parser = new PropertiesRuleConfigParser();
        }
        return parser;
    }

    /**
     * 简单工厂的优化
     *
     * @param configFormat
     * @return
     */
    private IRuleConfigParser createParserB(String configFormat) {
        return RuleConfigParserFactorySimple.createParser(configFormat);
    }

    /**
     * 工厂方法
     *
     * @param configFormat
     * @return
     */
    private IRuleConfigParser createParserC(String configFormat) {
        IRuleConfigParserFactory parserFactory = RuleConfigParserFactoryMap.createParser(configFormat);
        if (parserFactory == null) {
            return null;
        }
        IRuleConfigParser parser = parserFactory.createParser();
        return parser;
    }
}