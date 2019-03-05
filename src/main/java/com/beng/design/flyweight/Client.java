package com.beng.design.flyweight;

public class Client {
    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("Black");
        Chess chess2 = ChessFactory.getChess("Black");

        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("=======外部状态的处理=========");

        chess1.display(new Coordinate(2, 2));
        chess2.display(new Coordinate(2, 2));
    }
}
