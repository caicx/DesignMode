package strategy.richenumtype;

public enum TRAVEL_TYPE {
    car("自驾出游", TravelInterface.byCar()),
    airplane("乘坐飞机出游", TravelInterface.byAirplane()),
    train("乘坐火车出游", TravelInterface.byTrain()),
    walking("腿着出游", TravelInterface.byWalking());

    TravelInterface travelInterface;
    String msg;

    private TRAVEL_TYPE(String msg, TravelInterface travelInterface) {
        this.msg = msg;
        this.travelInterface = travelInterface;


    }

    public TravelInterface getTravelInterface() {
        return travelInterface;
    }
}
