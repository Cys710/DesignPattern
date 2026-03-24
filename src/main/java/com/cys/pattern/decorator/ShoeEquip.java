package com.cys.pattern.decorator;

/**
 * 鞋子
 * @author cys
 */
public class ShoeEquip implements IEquip{
    @Override
    public int culAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战靴子";
    }
}
