import java.util.Scanner;

public class Main {
    static CompareData myData = new CompareData();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        setData();
        menu();
    }

    static void setData() {
        System.out.println("Enter electricity price: ");
        myData.setElectricPrice(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter gas price: ");
        myData.setGasPrice(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter diesel price: ");
        myData.setDieselPrice(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter miles to drive each working day: ");
        myData.setMilesToDrive(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter monthly parking cost: ");
        myData.setParkingPrice(sc.nextDouble());
        sc.nextLine();

        System.out.println("Enter monthly train ticket cost: ");
        myData.setTrainTicketPrice(sc.nextDouble());
        sc.nextLine();

    }

    static void menu() {
        while(true) {
        System.out.println("""
                1. Add an electric car
                2. Add a gas powered car
                3. Add diesel powered car
                4. Get result
                5. Quit""");

        int choice = sc.nextInt();
        sc.nextLine();


            switch (choice) {
                case 1 -> {
                    myData.addElectricCar();
                }
                case 2 -> {
                    myData.addGasCar();
                }
                case 3 -> {
                    myData.addDieselCar();
                }
                case 4 -> {
                    myData.getResult();
                }
                case 5 -> {
                    System.exit(0);
                }
            }
        }
    }
}