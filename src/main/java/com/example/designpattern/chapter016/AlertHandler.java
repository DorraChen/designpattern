package com.example.designpattern.chapter016;

import com.example.designpattern.chapter016.model.ApiStatInfo;

/**
 * @author clz
 * @date 2020/1/28 16:54
 * @description
 */
public abstract class AlertHandler {
    protected AlertRule rule;
    protected Notification notification;
    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * 校验
     *
     * @param apiStatInfo
     */
    public abstract void check(ApiStatInfo apiStatInfo);
}
