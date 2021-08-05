package com.example.designpattern;

import com.example.designpattern.enums.NotificationEmergencyLevel;

/**
 * @author dorra
 * @date 2020/1/28 17:15
 * @description 告警通知类，支持邮件、短信、微信、手机等多种通知渠道
 */
public class Notification {

    /**
     * 通知等级+通知消息
     *
     * @param severe
     * @param s
     */
    public void notify(NotificationEmergencyLevel severe, String s) {
    }
}
