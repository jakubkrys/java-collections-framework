package pl.jakubkrys.car_duel;

import java.util.Scanner;

public class CarDuelMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CarsComparator carsComparator = new CarsComparator();
        int option;

        do {
            System.out.println("----- Car Duel -----");
            System.out.println("1 - compare two cars");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    Car car1 = parametersOfCar1(scanner);
                    Car car2 = parametersOfCar2(scanner);

//                    compareCarsWithComparable(car1, car2);
                    compareCarsWithComparator(carsComparator, car1, car2);
                case 0:
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static void compareCarsWithComparator(CarsComparator carsComparator, Car car1, Car car2) {
        if(carsComparator.compare(car1, car2) > 0) {
            System.out.println("Better car is car 1\n");
        } else {
            System.out.println("Better car is car 2\n");
        };
    }

    private static Car parametersOfCar1(Scanner scanner) {
        System.out.println("--- Car 1 ---");
        System.out.print("Price: ");
        int price1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel consuming: ");
        double fuelConsuming1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Engine capacity: ");
        double engineCapacity1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        return new Car (price1,fuelConsuming1,engineCapacity1);
    }

    private static Car parametersOfCar2(Scanner scanner) {
        System.out.println("--- Car 2 ---");
        System.out.print("Price: ");
        int price2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Fuel consuming: ");
        double fuelConsuming2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Engine capacity: ");
        double engineCapacity2 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        Car car2 = new Car (price2,fuelConsuming2,engineCapacity2);
        return car2;
    }

    private static void compareCarsWithComparable(Car car1, Car car2) {
        if(car1.compareTo(car2) > 0) {
            System.out.println("Better car is car 1\n");
        } else {
            System.out.println("Better car is car 2\n");
        }
    }
}