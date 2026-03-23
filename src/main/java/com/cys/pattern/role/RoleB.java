package com.cys.pattern.role;

/**
 * @author cys
 */
public class RoleB extends Role{
    public RoleB(String name){
        this.name = name;
    }

    @Override
    protected void display() {
        System.out.println("帅哥");
    }

    @Override
    protected void run() {
        System.out.println("金蝉脱壳");
    }

    @Override
    protected void attack() {
        System.out.println("降龙十八掌");
    }

    @Override
    protected void defend() {
        System.out.println("铁布衫");
    }
}

