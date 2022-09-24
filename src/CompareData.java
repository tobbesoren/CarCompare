import java.util.ArrayList;
import java.util.Scanner;

public class CompareData {
     static Scanner sc = new Scanner(System.in);
    private double electricPrice;
    private double gasPrice;
    private double dieselPrice;
    private double milesToDrive;
    private double parkingPrice;
    private double trainTicketPrice;

    private ArrayList<Car> cars = new ArrayList<>();

    public double getElectricPrice() {
        return electricPrice;
    }

    public void setElectricPrice(double electricPrice) {
        this.electricPrice = electricPrice;
    }

    public double getGasPrice() {
        return gasPrice;
    }

    public void setGasPrice(double gasPrice) {
        this.gasPrice = gasPrice;
    }

    public double getDieselPrice() {
        return dieselPrice;
    }

    public void setDieselPrice(double dieselPrice) {
        this.dieselPrice = dieselPrice;
    }

    public double getMilesToDrive() {
        return milesToDrive;
    }

    public void setMilesToDrive(double milesToDrive) {
        this.milesToDrive = milesToDrive;
    }

    public double getParkingPrice() {
        return parkingPrice;
    }

    public void setParkingPrice(double parkingPrice) {
        this.parkingPrice = parkingPrice;
    }

    public double getTrainTicketPrice() {
        return trainTicketPrice;
    }

    public void setTrainTicketPrice(double trainTicketPrice) {
        this.trainTicketPrice = trainTicketPrice;
    }

    public double sumAllCosts(Car car) {
        return car.getMonthlyPayment() + (car.getCostPerMile(this) * milesToDrive * 20) + parkingPrice
                + trainTicketPrice;
    }

    public void addElectricCar() {
        ElectricCar newCar = new ElectricCar();
        System.out.println("Enter car type: ");
        newCar.setCarType(sc.nextLine());

        System.out.println("Enter monthly payment: ");
        newCar.setMonthlyPayment(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter energy consumption: ");
        newCar.setEnergyConsumption(sc.nextDouble());
        sc.nextLine();

        cars.add(newCar);
    }

    public void addGasCar() {
        GasCar newCar = new GasCar();
        System.out.println("Enter car type: ");
        newCar.setCarType(sc.nextLine());

        System.out.println("Enter monthly payment: ");
        newCar.setMonthlyPayment(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter energy consumption: ");
        newCar.setEnergyConsumption(sc.nextDouble());
        sc.nextLine();
        cars.add(newCar);
    }

    public void addDieselCar() {
        DieselCar newCar = new DieselCar();
        System.out.println("Enter car type: ");
        newCar.setCarType(sc.nextLine());

        System.out.println("Enter monthly payment: ");
        newCar.setMonthlyPayment(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter energy consumption: ");
        newCar.setEnergyConsumption(sc.nextDouble());
        sc.nextLine();

        cars.add(newCar);
    }

    public void getResult() {
        if (cars.size() == 0) {
            System.out.println("No cars added!");
            return;
        }
        for(Car car: cars) {
            System.out.println("Car:" + car.getCarType());
            System.out.println("Monthly cost: " + sumAllCosts(car));
        }
    }
}
