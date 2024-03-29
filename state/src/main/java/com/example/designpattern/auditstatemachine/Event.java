package com.example.designpattern.auditstatemachine;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

/**
 * @author dorra
 * @date 2021/1/7 14:27
 * @description 触发的事件
 */
public class Event {
    /**
     * 事件标识(编码)
     */
    @Getter
    private String eventCode;

    /**
     * 附属的业务参数
     */
    @Getter
    @Setter
    private Map<Object, Object> attributes = null;

    public Event(String eventCode) {
        this.eventCode = eventCode;
    }

    public Event(String eventCode, Map<Object, Object> attributes) {
        this.eventCode = eventCode;
        this.attributes = attributes;
    }

    @Override
    public String toString() {
        return eventCode;
    }
}
