package com.example.designpattern.mario;

/**
 * @author dorra
 * @date 2021/1/7 22:27
 * @description 马里奥可以变身为多种形态，
 * 比如小马里奥（Small Mario）、
 * 超级马里奥（Super Mario）、
 * 火焰马里奥（Fire Mario）、
 * 斗篷马里奥（Cape Mario）等等
 */
public enum State {
    /**
     * 小马里奥（Small Mario）
     */
    SMALL(0),
    /**
     * 超级马里奥（Super Mario）
     */
    SUPER(1),
    /**
     * 火焰马里奥（Fire Mario）
     */
    FIRE(2),
    /**
     * 斗篷马里奥（Cape Mario）
     */
    CAPE(3);
    private int value;

    State(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
