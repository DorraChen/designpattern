package com.example.designpattern.handler;

import com.example.designpattern.AlertHandler;
import com.example.designpattern.AlertRule;
import com.example.designpattern.Notification;
import com.example.designpattern.model.ApiStatInfo;

/**
 * @author dorra
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
