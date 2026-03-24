package com.cys.pattern.decorator;

/**
 * 红宝石
 * @author cys
 */
public class RedGemDecorator implements  IEquipDecorator{

    private IEquip equip;

    public RedGemDecorator(IEquip equip){
        this.equip = equip;
    }

    @Override
    public int culAttack() {
        return 15 + equip.culAttack();
    }

    @Override
    public String description() {
        return equip.description() + "蓝宝石";
    }
}