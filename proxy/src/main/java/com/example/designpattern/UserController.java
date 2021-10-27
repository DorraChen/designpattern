package com.example.designpattern;

/**
 * @author dorra
 * @date 2021/1/27 17:06
 * @description
 */
class UserController implements IUserController {

    @Override
    public void login() {
        System.out.println("UserController login...");
    }
}