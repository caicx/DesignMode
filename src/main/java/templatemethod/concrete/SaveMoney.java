package templatemethod.concrete;

import templatemethod.abstracts.Bank;

public class SaveMoney extends Bank {

    private boolean b = false;

    public SaveMoney(boolean b) {
        this.b = b;
    }

    @Override
    protected void handleTheBusiness() {
        System.out.println("抽象方法>办理存钱业务");
    }

    @Override
    protected boolean isNewCustomer() {
        return b;
    }
}
