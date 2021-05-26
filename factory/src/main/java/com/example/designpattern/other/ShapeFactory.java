package com.example.designpattern.other;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

/**
 * @author dorra
 * @date 2021/5/26 16:07
 * @description 使用 lambda 实现工厂模式
 */
public class ShapeFactory {
    final static Map<String, Supplier<Shape>> map = new HashMap<>();

    static {
        map.put("CIRCLE", Circle::new);
        map.put("RECTANGLE", Rectangle::new);
    }

    public Shape getShape(String shapeType) {
        Supplier<Shape> shape = map.get(shapeType.toUpperCase());
        if (shape != null) {
            return shape.get();
        }
        throw new IllegalArgumentException("No such shape " + shapeType.toUpperCase());
    }
}
