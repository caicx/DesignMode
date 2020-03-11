package templatemethod.concrete;

import lombok.Data;
import templatemethod.abstracts.Bank;

public class DrawMoney extends Bank {
    @Override
    protected void handleTheBusiness() {
        System.out.println("抽象方法>办理取钱业务");
    }
}
