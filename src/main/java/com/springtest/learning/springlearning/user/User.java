package com.springtest.learning.springlearning.user;

import java.util.Date;

public class User {

    private Integer id;
    private String name;
    private Date bDay;

    protected User(){

    }
    public User(Integer id, String name, Date bDay) {
        super();
        this.id = id;
        this.name = name;
        this.bDay = bDay;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getbDay() {
        return bDay;
    }

    public void setbDay(Date bDay) {
        this.bDay = bDay;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bDay=" + bDay +
                '}';
    }
}
