package com.beng.design.command;

public interface Command {

    public void command();
}

class ConcreteCommand implements Command {

    Receiver r;

    public ConcreteCommand(Receiver r) {
        this.r = r;
    }

    @Override
    public void command() {
        r.action();
    }

}
