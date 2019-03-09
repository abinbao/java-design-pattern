package com.beng.design.mediator;

/**
 * @author apple
 */
public interface Mediatora {

    void register(String dname, Department d);

    void command(String dname);

}
