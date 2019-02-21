package com.beng.design.propertype;

import java.io.Serializable;
import java.util.Date;

public class Sheep implements Cloneable, Serializable {

    private String name;
    private Date birthday;

    public Sheep(String string, Date date) {
        this.name = string;
        this.birthday = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }

}
