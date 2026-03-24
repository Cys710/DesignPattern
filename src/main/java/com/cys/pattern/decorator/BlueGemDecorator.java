package com.cys.pattern.decorator;

/**
 * 蓝宝石
 * @author cys
 */
public class BlueGemDecorator implements  IEquipDecorator{

    private IEquip equip;

    public BlueGemDecorator(IEquip equip){
        this.equip = equip;
    }

    @Override
    public int culAttack() {
        return 5 + equip.culAttack();
    }

    @Override
    public String description() {
        return equip.description() + "蓝宝石";
    }
}
