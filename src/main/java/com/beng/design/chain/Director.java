package com.beng.design.chain;

/**
 * @author apple
 */
public class Director extends Leader {

    public Director(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LevelReq levelReq) {
        if (levelReq.getDays() < 3) {
            System.out.println("员工：" + levelReq.getEmpName() + "，因为" + levelReq.getReason() + " 请假 "
                    + levelReq.getDays() + " 天 。");
            System.out.println("经理：" + this.name + " 审批通过。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(levelReq);
            }
        }
    }

}
