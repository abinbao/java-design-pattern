package com.beng.design.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类 池化
 * 
 * @author apple
 */
public class ChessFactory {

    private static Map<String, Chess> map = new HashMap<>();

    public static Chess getChess(String color) {
        if (map.containsKey(color)) {
            return map.get(color);
        }
        Chess chess = new ConcreteChess(color);
        map.put(color, chess);
        return chess;
    }
}
