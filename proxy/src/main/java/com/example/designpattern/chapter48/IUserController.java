package com.example.designpattern.chapter48;

/**
 * @author dorra
 * @date 2021/1/27 17:06
 * @description
 */

public interface IUserController {
    void login();
}

class UserController implements IUserController {

    @Override
    public void login() {
        System.out.println("UserController login...");
    }
}