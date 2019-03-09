package com.beng.design.command;

public class Invoke {

    private Command c;

    public Invoke(Command c) {
        this.c = c;
    }

    public void invoke() {
        c.command();
    }
}
