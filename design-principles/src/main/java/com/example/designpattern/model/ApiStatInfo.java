package com.example.designpattern.model;

import lombok.Data;

/**
 * @author dorra
 * @date 2020/1/28 17:03
 * @description
 */
@Data
public class ApiStatInfo {
    /**
     * 接口名
     */
    private String api;
    /**
     * 请求次数
     */
    private long requestCount;
    /**
     * 错误次数
     */
    private long errorCount;
    private long durationOfSeconds;
}
