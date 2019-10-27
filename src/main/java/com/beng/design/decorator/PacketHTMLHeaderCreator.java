package com.beng.design.decorator;

/**
 * @desc 具体的装饰器，给content 添加 html 标签
 * @author apple
 * @date 2019年10月27日
 */
public class PacketHTMLHeaderCreator extends PackageDecorator {

    public PacketHTMLHeaderCreator(IPackageCreator component) {
        super(component);
    }

    @Override
    public String handleContent() {
        StringBuilder sb = new StringBuilder();
        sb.append("<html>");
        sb.append("<body>");
        sb.append(component.handleContent());
        sb.append("</body>");
        sb.append("</html>\n");
        return sb.toString();
    }

}
