package com.beng.design.decorator;

/**
 * @desc 具体的装饰器，给content 添加 Http Header
 * @author apple
 * @date 2019年10月27日
 */
public class PacketHTTPHeaderCreator extends PackageDecorator {

    public PacketHTTPHeaderCreator(IPackageCreator component) {
        super(component);
    }

    @Override
    public String handleContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cache-Control: no-cache\n");
        sb.append(component.handleContent());
        return sb.toString();
    }

}
