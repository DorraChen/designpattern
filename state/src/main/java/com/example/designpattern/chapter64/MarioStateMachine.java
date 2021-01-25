package com.example.designpattern.chapter64;

/**
 * @author clz
 * @date 2021/1/7 22:29
 * @description
 */
public class MarioStateMachine {
    private int score;
    private State currentState;

    public MarioStateMachine() {
        this.score = 0;
        this.currentState = State.SMALL;
    }

    /**
     * 获得蘑菇
     */
    public void obtainMushRoom() {
        //TODO
    }

    /**
     * 获得斗篷
     */
    public void obtainCape() {
        //TODO
    }

    /**
     * 获得火焰
     */
    public void obtainFireFlower() {
        //TODO
    }

    /**
     * 遇到怪物
     */
    public void meetMonster() {
        //TODO
    }

    public int getScore() {
        return this.score;
    }

    public State getCurrentState() {
        return this.currentState;
    }
}