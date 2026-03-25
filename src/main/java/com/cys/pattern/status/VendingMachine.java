package com.cys.pattern.status;

/**
 * @author cys
 */
public class VendingMachine {
    // 已投币
    private final static int HAS_MONEY = 0;
    // 未投币
    private final static int NO_MONEY = 1;
    // 售出商品
    private final static int SOLD = 2;
    // 商品售罄
    private final static int SOLD_OUT = 3;

    // 当前状态
    private int curStatus = NO_MONEY;
    // 商品数量
    private int cnt = 0;

    public VendingMachine(int cnt){
        this.cnt = cnt;
        if(cnt > 0) {
            curStatus = NO_MONEY;
        }
    }

    // 投入硬币
    public void insertMoney(){
        switch(curStatus){
            case NO_MONEY :
                curStatus = HAS_MONEY;
                System.out.println("成功投币");
                break;
            case HAS_MONEY:
                System.out.println("已投币,无需逃避");
                break;
            case SOLD:
                System.out.println("请稍等...");
                break;
            case SOLD_OUT:
                System.out.println("商品已售罄");
                break;
        }
    }
    // 退币
    public void backMoney(){
        switch (curStatus){
            case NO_MONEY :
                System.out.println("您未投入硬币");
                break;
            case HAS_MONEY:
                curStatus = NO_MONEY;
                System.out.println("退币成功");
                break;
            case SOLD:
                System.out.println("已消费");
                break;
            case SOLD_OUT:
                System.out.println("您未投入...");
                break;
        }
    }
    // 转动手柄
    public void turnCrank(){
        switch (curStatus){
            case NO_MONEY :
                System.out.println("请先投入硬币");
                break;
            case HAS_MONEY:
                curStatus = SOLD;
                System.out.println("正在出售商品");
                // 发放商品
                dispense();
                break;
            case SOLD:
                System.out.println("连续转动没用");
                break;
            case SOLD_OUT:
                System.out.println("商品已售罄");
                break;
        }
    }
    // 发放商品
    private void dispense(){
        switch(curStatus){
            case SOLD:
                cnt--;
                System.out.println("发出商品...");
                if(cnt == 0){
                    System.out.println("商品售罄");
                    curStatus = SOLD_OUT;
                }else{
                    curStatus = NO_MONEY;
                }
                break;
            default:
                throw new IllegalStateException("非法状态");
        }
    }
}
