package com.cys.pattern.adapter;

/**
 * @author cys
 */
public class Mobile {
    public void charge(V5Power power){
        System.out.println("我需要5V电压,现在是" + power.provideV5Power()+"V");
    }
}
