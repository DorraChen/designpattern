package com.example.designpattern.other;

import java.util.function.Supplier;

/**
 * @author dorra
 * @date 2021/5/26 16:27
 * @description
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Supplier<ShapeFactory> shapeFactory =  ShapeFactory::new;
        shapeFactory.get().getShape("circle").draw();
        shapeFactory.get().getShape("rectangle").draw();
        shapeFactory.get().getShape("parallelogram").draw();
    }
}
