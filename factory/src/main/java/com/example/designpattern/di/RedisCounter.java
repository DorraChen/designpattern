package com.example.designpattern.di;

/**
 * @author dorra
 * @date 2021/5/26 17:29
 * @description
 */
public class RedisCounter {
    private String ipAddress;
    private String port;

    public RedisCounter(String ipAddress, String port) {
        this.ipAddress = ipAddress;
        this.port = port;
    }

    public int increamentAndGet() {
        System.out.println("Connect to " + this.ipAddress + ":" + this.port);
        return 10;
    }
}
