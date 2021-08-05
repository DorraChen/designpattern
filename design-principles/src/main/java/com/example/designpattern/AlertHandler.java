package com.example.designpattern;

import com.example.designpattern.model.ApiStatInfo;

/**
 * @author dorra
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
