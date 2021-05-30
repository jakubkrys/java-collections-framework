package pl.jakubkrys.mugs;

import java.util.Scanner;

public class MugsShopMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        MugsRepo repo = new MugsRepo();
        int option;

        do {
            System.out.println("----- Mugs Shop Menu -----");
            System.out.println("1 - add mug");
            System.out.println("2 - pick up mug");
            System.out.println("0 - quit");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Inscription: ");
                    String inscription = scanner.nextLine();
                    Mug mug = new Mug(inscription);
                    repo.addMug(mug);
                    break;
                case 2:
                    System.out.println(repo.getMug());
                    break;
            }
        } while (option != 0);
        scanner.close();
    }
}