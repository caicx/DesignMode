package strategy.normal;

import java.text.MessageFormat;
public class Travel {
    private double budget;

    public Travel(double budget) {
        this.budget = budget;
    }

    public void trafficTools(String type) {
        double money = 0.00;
        String msg = "";
        if ("car".equals(type)) {
            money = 600.00;
            msg = "自驾出游";
        } else if ("airplane".equals(type)) {
            money = 5000.00;
            msg = "乘坐飞机出游";
        } else if ("train".equals(type)) {
            money = 1200.00;
            msg = "乘坐火车出游";
        } else if ("walking".equals(type)) {
            money = 0.00;
            msg = "腿着出游";
        }
        System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, money, budget - money));
    }
}

