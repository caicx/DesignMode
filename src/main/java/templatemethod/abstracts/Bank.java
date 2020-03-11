package templatemethod.abstracts;

public abstract class Bank {
    public final void process() {
        // 取号
        takeNo();
        // 新客户开户
        if(isNewCustomer()) {
            openAnAccount();
        }
        // 办理业务
        handleTheBusiness();
    }

    final void openAnAccount() {
        System.out.println("钩子方法>给新用户开户");
    };

    protected abstract void handleTheBusiness();

    protected boolean isNewCustomer(){
        return false;
    }

    public void takeNo() {
        System.out.println("具体方法>取号");
    }
}
