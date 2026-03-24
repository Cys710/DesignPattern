package com.cys.pattern.facade.devide;

/**
 * 投影仪
 * @author cys
 */
public class Projector {
    public void on(){
        System.out.println("打开投影仪");
    }
    public void off(){
        System.out.println("关闭投影仪");
    }
    public void close(){
        System.out.println("停止投影");
    }
    public void open(){
        System.out.println("开始投影");
    }
}
