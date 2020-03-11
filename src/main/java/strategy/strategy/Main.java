package strategy.strategy;

public class Main {
    public static void main(String[] args) {
        Travel travelCar = new Travel(10000.00, new CarBudget());
        travelCar.trafficTools();
        Travel travelTrain = new Travel(30000.00, new TrainBudget());
        travelTrain.trafficTools();
    }
}
