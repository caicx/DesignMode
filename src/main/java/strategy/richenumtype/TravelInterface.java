package strategy.richenumtype;

import java.text.MessageFormat;

public interface TravelInterface {
    public void trafficTools(double budget);

    public static TravelInterface byCar(){
        return budget -> {
            String msg = "自驾出游";
            double money = 600.00;
            System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, money, budget - money));

        };
    }

    public static TravelInterface byAirplane(){
        return budget -> {
            String msg = "乘坐飞机出游";
            double money = 5000.00;
            System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, money, budget - money));

        };
    }

    public static TravelInterface byTrain(){
        return budget -> {
            String msg = "乘坐火车出游";
            double money = 1200.00;
            System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, money, budget - money));

        };
    }

    public static TravelInterface byWalking(){
        return budget -> {
            String msg = "腿着出游";
            double money = 0.00;
            System.out.println(MessageFormat.format("出游方式为：{0}，花费{1}，剩余预算{2}", msg, money, budget - money));

        };
    }
}
