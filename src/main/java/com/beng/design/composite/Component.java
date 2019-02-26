package com.beng.design.composite;

/**
 * 抽象组件
 * 
 * @author apple
 */
public interface Component {
    void operate();
}

// 叶子组件
interface Leaf extends Component {

}

// 容器组件
interface Composite extends Component {

    void add(Component component);

    void remove(Component component);

    Component getChildren(int index);
}