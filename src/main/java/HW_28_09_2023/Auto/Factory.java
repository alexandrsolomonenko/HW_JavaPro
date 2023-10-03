package HW_28_09_2023.Auto;

public class Factory {
    public static Auto produceTruck(int enginePower, String brand, String model) {
        Auto truck = new Auto(Auto.AutoType.TRUCK);
        truck.setEnginePower(enginePower);
        truck.setBrand(brand);
        truck.setModel(model);
        return truck;
    }

    public static Auto produceSportCar(int enginePower, String brand, String model) {
        Auto sportCar = new Auto(Auto.AutoType.SPORT_CAR);
        sportCar.setEnginePower(enginePower);
        sportCar.setBrand(brand);
        sportCar.setModel(model);
        return sportCar;
    }

    public static Auto produceSedan(int enginePower, String brand, String model) {
        Auto sedan = new Auto(Auto.AutoType.SEDAN);
        sedan.setEnginePower(enginePower);
        sedan.setBrand(brand);
        sedan.setModel(model);
        return sedan;
    }
}
