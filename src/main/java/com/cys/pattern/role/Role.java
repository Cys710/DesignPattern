package com.cys.pattern.role;

/**
 * @author cys
 */
public abstract class Role {
    protected String name;

    // 着装
    protected abstract void display();
    // 逃跑
    protected abstract void run();
    // 攻击
    protected abstract void attack();
    // 防御
    protected abstract void defend();
}
