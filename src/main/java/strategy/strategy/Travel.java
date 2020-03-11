package strategy.strategy;

import java.text.MessageFormat;

public class Travel {
    private double budgetMoney;
    private Budget budget;
    public Travel(double budgetMoney, Budget budget) {
        this.budgetMoney = budgetMoney;
        this.budget = budget;
    }

    public void trafficTools() {
        double money = budget.budget(budgetMoney);
        String msg = budget.getMsg();
        System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, budgetMoney - money, money));
    }
}
