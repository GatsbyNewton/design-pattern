package edu.wzm.action.strategy.example;

public class CashFactory {
    private String type;
    private double money;
    private float rebate;
    private double threshold;
    private double moneyReturn;

    public void pay(String type){
        CashSuper cashSuper;
        switch (type){
            case "Normal":
                cashSuper = new CashNormal();
                System.out.println(type + ": " + cashSuper.acceptCash(money));
                break;
            case "Rebate":
                cashSuper = new CashRebate(rebate);
                System.out.println(type + ": " + cashSuper.acceptCash(money));
                break;
            case "Return":
                cashSuper = new CashReturn(threshold, moneyReturn);
                System.out.println(type + ": " + cashSuper.acceptCash(money));
                break;
            default:
                System.out.println("传入参数错误！");
                break;
        }
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setRebate(float rebate) {
        this.rebate = rebate;
    }

    public void setThreshold(double threshold) {
        this.threshold = threshold;
    }

    public void setMoneyReturn(double moneyReturn) {
        this.moneyReturn = moneyReturn;
    }
}
