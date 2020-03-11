package templatemethod;

import templatemethod.abstracts.Bank;
import templatemethod.concrete.DrawMoney;
import templatemethod.concrete.SaveMoney;

public class Main {
    public static <isNewCustomer> void main(String[] args) {
        System.out.println("----------------------------");
        Bank saveMoney = new SaveMoney(true);
        saveMoney.process();
        System.out.println("----------------------------");
        Bank drawMoney = new DrawMoney();
        drawMoney.process();
        System.out.println("----------------------------");
        new Bank() {
            @Override
            protected void handleTheBusiness() {
                System.out.println("具体方法>老客户办理公积金业务");
            }
            @Override
            public void takeNo() {
                System.out.println("我是vip，不用取号");
            }
        }.process();
        System.out.println("----------------------------");
        new Bank() {
            @Override
            protected void handleTheBusiness() {
                System.out.println("具体方法>新客户办理公积金业务");
            }
            @Override
            protected boolean isNewCustomer() {
                return true;
            }
        }.process();
        System.out.println("----------------------------");

    }



}
