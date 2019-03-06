package com.beng.design.chain;

/**
 * @author apple
 */
public class Master extends Leader {

    public Master(String name) {
        super(name);
    }

    @Override
    public void handleRequest(LevelReq levelReq) {
        if (levelReq.getDays() < 30) {
            System.out.println("员工：" + levelReq.getEmpName() + "，因为" + levelReq.getReason() + " 请假 "
                    + levelReq.getDays() + " 天 。");
            System.out.println("老大：" + this.name + " 审批通过。");
        } else {
            if (this.nextLeader != null) {
                this.nextLeader.handleRequest(levelReq);
            } else {
                System.out.println("辞职？？？？？？");
            }
        }
    }

}
