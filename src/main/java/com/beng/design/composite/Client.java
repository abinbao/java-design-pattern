package com.beng.design.composite;

public class Client {
    public static void main(String[] args) {

        AbstractFile f1, f2, f3;
        f1 = new ImageFile("Jay.jpg");
        f2 = new TextFile("test.txt");
        f3 = new VedioFile("世界大爆炸.mp4");
        Folder f4 = new Folder("我的收藏");
        // f1.killVirus();

        f4.add(f1);
        f4.add(f2);
        Folder f11 = new Folder("小白");
        f11.add(f3);

        f4.add(f11);
        f4.killVirus();

    }
}
