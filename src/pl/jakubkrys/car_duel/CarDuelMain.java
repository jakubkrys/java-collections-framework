package pl.jakubkrys.car_duel;

import java.util.Scanner;

public class CarDuelMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int option;

        do {

            System.out.println("----- Car Duel -----");
            System.out.println("1 - compare two cars");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
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

                    Car car1 = new Car (price1,fuelConsuming1,engineCapacity1);
                    Car car2 = new Car (price2,fuelConsuming2,engineCapacity2);

                    if(car1.compareTo(car2) > 0) {
                        System.out.println("Better car is car 1\n");
                    } else {
                        System.out.println("Better car is car 2\n");
                    }

                    break;
                case 2:
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
