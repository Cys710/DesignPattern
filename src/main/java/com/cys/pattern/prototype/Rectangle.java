package com.cys.pattern.prototype;

/**
 * @author cys
 */
public class Rectangle extends Shape{
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw()");
    }
}
