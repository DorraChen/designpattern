package com.example.designpattern;

import com.example.designpattern.model.ApiStatInfo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dorra
 * @date 2020/1/28 17:02
 * @description
 */

public class Alert {
    private List<AlertHandler> alertHandlers = new ArrayList<>();


    /**
     * 添加处理拦截
     *
     * @param alertHandler
     */
    public void addAlertHandler(AlertHandler alertHandler) {
        this.alertHandlers.add(alertHandler);
    }

    /**
     * 校验逻辑
     *
     * @param apiStatInfo
     */
    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler handler : alertHandlers) {
            handler.check(apiStatInfo);
        }
    }
}