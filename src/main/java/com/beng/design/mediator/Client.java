package com.beng.design.mediator;

public class Client {

    public static void main(String[] args) {
        Mediatora m = new President();
        Macket macket = new Macket(m);
        Development dev = new Development(m);
        Finacial f = new Finacial(m);

        m.command("finacial");
    }
}
