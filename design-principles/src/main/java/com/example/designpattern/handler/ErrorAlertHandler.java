package com.example.designpattern.handler;

import com.example.designpattern.AlertHandler;
import com.example.designpattern.AlertRule;
import com.example.designpattern.Notification;
import com.example.designpattern.model.ApiStatInfo;

/**
 * @author dorra
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
