package strategy.strategy;

class CarBudget extends Budget {
    public CarBudget() {
        super("自驾出游");
    }
    @Override
    double budget(double budget) {
        return budget - 600.00;
    }
}

class AirplaneBudget extends Budget {
    public AirplaneBudget() {
        super("乘坐飞机出游");
    }
    @Override
    double budget(double budget) {
        return budget - 5000.00;
    }
}

class TrainBudget extends Budget {
    public TrainBudget() {
        super("乘坐火车出游");
    }
    @Override
    double budget(double budget) {
        return budget - 1200.00;
    }
}

class WalkingBudget extends Budget {
    public WalkingBudget() {
        super("腿着出游");
    }
    @Override
    double budget(double budget) {
        return budget;
    }
}
