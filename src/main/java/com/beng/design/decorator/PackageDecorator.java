package com.beng.design.decorator;

/**
 * @desc 装饰者核心组件: 告诉子类自己只是其增强作用，核心业务由 component 实现
 * @author apple
 * @date 2019年10月27日
 */
public abstract class PackageDecorator implements IPackageCreator {

    IPackageCreator component;

    public PackageDecorator(IPackageCreator component) {
        this.component = component;
    }

}
