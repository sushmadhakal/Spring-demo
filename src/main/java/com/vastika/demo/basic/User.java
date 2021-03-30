package com.vastika.demo.basic;

import com.vastika.demo.basic.Dao;

public class User {
    //Dependency = this class does not write core logic instead it gets from other class
   // MysqlDao dao = new MysqlDao();

    //Dependency Injection : we inject the dependency through constructor so this will not depend on any classes
    //we can do DI using two methods: through constructor and set method

    Dao dao;
    //by constructor method
    public User(Dao dao){
        this.dao = dao;
    }

    //By setter method
    public void setDao(Dao dao){
        this.dao = dao;
    }

    public void saveUser(){
     dao.saveUser(this); //user is dependent on Mysqldao class beacuse it does not write its own methos


 }
}
