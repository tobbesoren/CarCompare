public class ElectricCar extends Car {
    public ElectricCar () {
        super();
    }

    @Override
    public double getCostPerMile(CompareData myData) {
        return energyConsumption * myData.getElectricPrice();
    }

}
