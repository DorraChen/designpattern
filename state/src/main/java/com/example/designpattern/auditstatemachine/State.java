package com.example.designpattern.auditstatemachine;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author dorra
 * @date 2021/1/7 14:26
 * @description 状态节点
 */
public class State {
    /**
     * 状态编码
     */
    @Getter
    private String stateCode;

    /**
     * 当前状态下可允许执行的动作
     */
    @Getter
    private List<Transition> transitions = new ArrayList<>();

    public State(String stateCode, Transition... transitions) {
        this.stateCode = stateCode;
        for (Transition transition : transitions) {
            this.transitions.add(transition);
        }
    }

    /**
     * 添加动作
     *
     * @param transition
     */
    public void addTransition(Transition transition) {
        transitions.add(transition);
    }

    @Override
    public String toString() {
        return stateCode;
    }
}
