public class GasCar extends Car {

    public GasCar () {
        super();
    }

    @Override
    public double getCostPerMile(CompareData myData) {
        return energyConsumption * myData.getGasPrice();
    }
}
