package com.beng.design.chain;

/**
 * 封装请假的信息
 * 
 * @author apple
 */
public class LevelReq {

    private String empName;
    private int days;
    private String reason;

    public LevelReq(String empName, int days, String reason) {
        this.empName = empName;
        this.days = days;
        this.reason = reason;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "LevelReq [empName=" + empName + ", days=" + days + ", reason=" + reason + "]";
    }
}
