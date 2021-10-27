package com.example.designpattern;

/**
 * @author dorra
 * @date 2021/1/27 17:11
 * @description
 */
public class MetricsCollector {
    public void recordRequest(RequestInfo requestInfo) {
        System.out.println(requestInfo.toString());
    }
}