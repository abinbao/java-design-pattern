package com.beng.design.chain;

/**
 * 抽象类
 * 
 * @author apple
 */
public abstract class Leader {

    protected String name;
    protected Leader nextLeader;

    public Leader(String name) {
        this.name = name;
    }

    // 设置责任链的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    public abstract void handleRequest(LevelReq levelReq);

}
