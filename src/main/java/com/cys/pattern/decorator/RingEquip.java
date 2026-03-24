package com.cys.pattern.decorator;

/**
 * 戒指
 * @author cys
 */
public class RingEquip implements IEquip{
    @Override
    public int culAttack() {
        return 5;
    }

    @Override
    public String description() {
        return "圣战戒指";
    }
}
