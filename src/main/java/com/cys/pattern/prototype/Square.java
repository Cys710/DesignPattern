package com.cys.pattern.prototype;

/**
 * @author cys
 */
public class Square extends Shape{
    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println("Inside Square::draw()");
    }
}
