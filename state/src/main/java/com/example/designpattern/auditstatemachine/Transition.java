package com.example.designpattern.auditstatemachine;

import lombok.Getter;

/**
 * @author dorra
 * @date 2021/1/7 14:28
 * @description 动作基类
 */
public abstract class Transition {

    /**
     * 触发事件
     */
    @Getter
    private String eventCode;

    /**
     * 触发当前状态
     */
    @Getter
    private State currState;

    /**
     * 触发后状态
     */
    @Getter
    private State nextState;

    public Transition(String eventCode, State currState, State nextState) {
        super();
        this.eventCode = eventCode;
        this.currState = currState;
        this.nextState = nextState;
    }

    /**
     * 执行动作
     *
     * @param event
     * @return
     */
    public State execute(Event event) {
        System.out.println(String.format("当前是：%s 状态，执行：%s 操作后，流转成：%s 状态。", currState, eventCode, nextState));
        if (this.doExecute(event)) {
            return this.nextState;
        } else {
            return null;
        }
    }

    /**
     * 执行动作的具体业务
     *
     * @param event
     * @return
     */
    protected abstract boolean doExecute(Event event);

}