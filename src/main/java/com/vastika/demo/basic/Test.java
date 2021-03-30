package com.vastika.demo.basic;

public class Test {
    public static void main(String[] args) {
        User user = new User(new MysqlDao());
        user.saveUser();

        User user1 = new User(new OracleDao());
        user1.saveUser();
    }
}
