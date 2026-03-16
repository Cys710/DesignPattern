package com.cys.pattern.singleton;

/**
 * @author cys
 */
public class SingleonClass {
    private SingleonClass(){}

    private static SingleonClass intance = new SingleonClass();
    public static SingleonClass getInstance(){
        return intance;
    }
}
