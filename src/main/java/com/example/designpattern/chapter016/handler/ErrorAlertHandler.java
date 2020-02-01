package com.example.designpattern.chapter016.handler;

import com.example.designpattern.chapter016.AlertHandler;
import com.example.designpattern.chapter016.AlertRule;
import com.example.designpattern.chapter016.Notification;
import com.example.designpattern.chapter016.enums.NotificationEmergencyLevel;
import com.example.designpattern.chapter016.model.ApiStatInfo;

/**
 * @author clz
 * @date 2020/1/28 17:16
 * @description
 */
public class ErrorAlertHandler extends AlertHandler {
    public ErrorAlertHandler(AlertRule rule, Notification notification){
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
//        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
//            notification.notify(NotificationEmergencyLevel.SEVERE, "...");
//        }
    }
}
