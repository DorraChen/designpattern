package com.example.designpattern.auditstatemachine;

/**
 * @author dorra
 * @date 2021/1/7 14:35
 * @description 参考博客:https://zhangzw.com/posts/20191017.html
 */
public class Demo {
    public static void main(String[] args) {
        StateMachine sm = new AuditStateMachine();
        State state = sm.execute(AuditStateMachine.StateCodeContents.PENDING,
                new Event(AuditStateMachine.EventCodeContents.PASS));
    }
}
