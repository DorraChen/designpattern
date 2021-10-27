package com.example.designpattern;

/**
 * @author dorra
 * @date 2021/1/27 17:11
 * @description
 */
public class RequestInfo {
    private String command;
    private Long startTime;
    private Long responseTime;

    public RequestInfo(String command, Long startTime, Long responseTime) {
        this.command = command;
        this.startTime = startTime;
        this.responseTime = responseTime;
    }

    @Override
    public String toString() {
        return "RequestInfo{" +
                "command='" + command + '\'' +
                ", startTime=" + startTime +
                ", responseTime=" + responseTime +
                '}';
    }
}
