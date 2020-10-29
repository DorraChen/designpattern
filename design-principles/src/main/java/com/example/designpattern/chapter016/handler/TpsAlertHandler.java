package com.example.designpattern.chapter016.handler;

import com.example.designpattern.chapter016.AlertHandler;
import com.example.designpattern.chapter016.AlertRule;
import com.example.designpattern.chapter016.Notification;
import com.example.designpattern.chapter016.model.ApiStatInfo;

/**
 * @author clz
 * @date 2020/1/28 17:14
 * @description
 */
public class TpsAlertHandler extends AlertHandler {
    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationOfSeconds();
//        if (tps > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
//            notification.notify(NotificationEmergencyLevel.URGENCY, "...");
//        }
    }
}
