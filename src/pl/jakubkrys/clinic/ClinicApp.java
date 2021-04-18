package pl.jakubkrys.clinic;

import pl.jakubkrys.import_from_file.Person;

import java.util.*;

public class ClinicApp {
    private static final int LIMIT = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<Person> register = new LinkedHashSet<>();
        int option;

        do {
            System.out.println("----- Clinic App -----");
            System.out.println("1 - register");
            System.out.println("2 - display all");
            System.out.println("0 - quit");
            option = scanner.nextInt();;
            scanner.nextLine();

            switch (option){
                case 1:
                    if (register.size() < LIMIT){
                        System.out.print("Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Surname: ");
                        String surname = scanner.nextLine();
                        System.out.print("Pesel: ");
                        String pesel = scanner.nextLine();

                        Person person = new Person(name,surname,pesel);
                        register.add(person);
                    } else {
                        System.out.println("No places.");
                    }
                    break;
                case 2:
                    System.out.println(register);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}
