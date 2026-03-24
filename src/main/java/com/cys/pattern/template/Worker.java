package com.cys.pattern.template;

public abstract class Worker {
    protected String name;

    public Worker(String name) {
        this.name = name;
    }

    public final void workOneDay(){
        enterCompany();
        computerOn();
        work();
        computerOff();
        exitCompany();
    }

    private void exitCompany() {
        System.out.println(name + "离开公司");
    }

    private void computerOff() {
        System.out.println(name + "关闭电脑");
    }

    public abstract void work();

    private void computerOn() {
        System.out.println(name + "打开电脑");
    }

    private void enterCompany() {
        System.out.println(name + "进入公司");
    }
}
