package com.beng.design.decorator;

public class Main {

    public static void main(String[] args) {
        IPackageCreator creator = new PacketHTTPHeaderCreator(new PacketHTMLHeaderCreator(new PackageBodyCreator()));
        System.out.println(creator.handleContent());
    }

}
