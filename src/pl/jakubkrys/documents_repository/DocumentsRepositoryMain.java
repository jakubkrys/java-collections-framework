package pl.jakubkrys.documents_repository;

import java.util.*;

public class DocumentsRepositoryMain {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        do {
            option = menu();
            switch (option){
                case 1:
                    System.out.println("1 - create document template");
                    break;
                case 2:
                    System.out.println("2 - read document template");
                    break;
                case 3:
                    System.out.println("3 - update document template");
                    break;
                case 4:
                    System.out.println("4 - delete document template");
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static int menu() {
        System.out.println("----- Documents Repository -----");
        System.out.println("1 - create document template");
        System.out.println("2 - read document template");
        System.out.println("3 - update document template");
        System.out.println("4 - delete document template");
        System.out.println("0 - quit");
        int option = scanner.nextInt();

        return option;
    }
}

