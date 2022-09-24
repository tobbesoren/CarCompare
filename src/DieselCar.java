public class DieselCar extends Car {
    public DieselCar () {
        super();
    }

    @Override
    public double getCostPerMile(CompareData myData) {
        return energyConsumption * myData.getDieselPrice();
    }
}
