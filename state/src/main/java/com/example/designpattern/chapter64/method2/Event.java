package com.example.designpattern.chapter64.method2;

import com.example.designpattern.chapter64.State;

import static com.example.designpattern.chapter64.State.*;

/**
 * @author dorra
 * @date 2021/1/7 22:35
 * @description
 */

public enum Event {
    GOT_MUSHROOM(0),
    GOT_CAPE(1),
    GOT_FIRE(2),
    MET_MONSTER(3);

    private int value;

    private Event(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}