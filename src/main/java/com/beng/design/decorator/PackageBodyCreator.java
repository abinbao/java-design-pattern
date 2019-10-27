package com.beng.design.decorator;

/**
 * @desc 被装饰者
 * @author apple
 * @date 2019年10月27日
 */
public class PackageBodyCreator implements IPackageCreator {

    @Override
    public String handleContent() {
        return "Hello World!";
    }

}
