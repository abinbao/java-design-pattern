package com.beng.design.flyweight;

/**
 * 享元类
 * 
 * @author apple
 */
public interface Chess {
    void setColor();

    String getColor();

    void display(Coordinate coo);
}

class ConcreteChess implements Chess {

    private String color;

    public ConcreteChess(String color) {
        super();
        this.color = color;
    }

    @Override
    public void setColor() {

    }

    @Override
    public String getColor() {
        return null;
    }

    @Override
    public void display(Coordinate coo) {
        System.out.println("棋子颜色： " + color);
        System.out.println(coo.toString());
    }

}
