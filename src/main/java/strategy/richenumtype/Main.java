package strategy.richenumtype;

public class Main {
    public static void main(String[] args) {
        String type = "car";
        TRAVEL_TYPE.valueOf(type).getTravelInterface().trafficTools(10000.00);
    }
}
