package com.cys.pattern.template;

/**
 * 程序员
 * @author cys
 */
public class ITWorker extends Worker{
    public ITWorker(String name) {
        super(name);
    }

    @Override
    public void work() {
        System.out.println(name+"写程序");
    }
}
