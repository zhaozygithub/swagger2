package com.ssq.swagger.bean;

import java.util.Date;

/**
 * @author shaosq
 * @ClassName com.ssq.swagger.bean.User
 * @Description
 */
public class User {

    private int id;
    private String username;
    private int age;
    private Date ctm;

    public User(int id, String username, int age, Date ctm) {
        this.id = id;
        this.username = username;
        this.age = age;
        this.ctm = ctm;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getCtm() {
        return ctm;
    }

    public void setCtm(Date ctm) {
        this.ctm = ctm;
    }

}