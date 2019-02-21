package com.beng.design.propertype;

import java.util.Date;

public class SheepOne implements Cloneable {
    private String name;
    private Date birthday;

    public SheepOne(String string, Date date) {
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

        // 添加如下代码进行深复制
        SheepOne s = (SheepOne) obj;
        s.birthday = (Date) this.birthday.clone();
        return obj;
    }

}
