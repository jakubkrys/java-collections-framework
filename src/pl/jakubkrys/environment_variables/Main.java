package pl.jakubkrys.environment_variables;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VariablesRepo repo = new VariablesRepo();
        int option;

        do {
            System.out.println("----- Menu -----");
            System.out.println("1 - add variable");
            System.out.println("2 - get value by name");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Path: ");
                    String path = scanner.nextLine();
                    Variable variable = new Variable(name,path);
                    repo.addVariableToMap(variable);
                    break;
                case 2:
                    System.out.print("Name: ");
                    String variableName = scanner.nextLine();
                    repo.getVariableByName(variableName);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}