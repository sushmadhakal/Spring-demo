package com.vastika.demo.basic;

public class OracleDao implements Dao {

    @Override
    public void saveUser(User user) {
        System.out.println("the user info is saved in Oracle!!");
    }
}
