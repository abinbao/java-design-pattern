package com.beng.design.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author apple
 */
public interface AbstractFile {
    void killVirus();
}

class ImageFile implements AbstractFile {

    private String name;

    public ImageFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("===>>> 图像文件：" + name + " 进行查杀<<<===");
    }

}

class TextFile implements AbstractFile {
    private String name;

    public TextFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("===>>> 文本文件：" + name + " 进行查杀<<<===");
    }

}

class VedioFile implements AbstractFile {
    private String name;

    public VedioFile(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("===>>> 视频文件：" + name + " 进行查杀<<<===");
    }

}

// 容器组件
interface AbstractFolder<T> {

    void add(T component);

    void remove(T component);

    T getChildren(int index);
}

class Folder implements AbstractFile, AbstractFolder<AbstractFile> {

    private String name;
    // 定义容器，用来存储容器构件下的子节点
    private List<AbstractFile> list = new ArrayList<>();

    public Folder(String name) {
        super();
        this.name = name;
    }

    @Override
    public void killVirus() {
        System.out.println("===>>>文件夹" + name + "开始查杀<<<===");
        for (AbstractFile file : list) {
            file.killVirus();
        }
    }

    @Override
    public void add(AbstractFile component) {
        list.add(component);
    }

    @Override
    public void remove(AbstractFile component) {
        list.remove(component);
    }

    @Override
    public AbstractFile getChildren(int index) {
        return list.get(index);
    }

}