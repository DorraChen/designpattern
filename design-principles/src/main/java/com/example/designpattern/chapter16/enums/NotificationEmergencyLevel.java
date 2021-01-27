package com.example.designpattern.chapter16.enums;

/**
 * @author clz
 * @date 2020/1/28 17:09
 * @description
 */
public enum NotificationEmergencyLevel {
    /**
     * SEVERE（严重）、URGENCY（紧急）、NORMAL（普通）、TRIVIAL（无关紧要）
     */
    SEVERE("严重"),
    URGENCY("紧急"),
    NORMAL("普通"),
    TRIVIAL("无关紧要");
    /**
     * 等级
     */
    private String level;

    NotificationEmergencyLevel(String level) {
        this.level = level;
    }

    public String getLevel() {
        return this.level;
    }
}
