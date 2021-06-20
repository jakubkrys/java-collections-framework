package pl.jakubkrys.dictionary;

import java.util.Scanner;

public class DictionaryMAIN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        int option;

        do{
            System.out.println("----- Dictionary -----");
            System.out.println("1 - add record");
            System.out.println("2 - translate PL -> ENG");
            System.out.println("3 - display all words");
            System.out.println("0 - quit app");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    System.out.print("PL: ");
                    String pol = scanner.nextLine();
                    System.out.print("ENG: ");
                    String eng = scanner.nextLine();

                    dictionary.addToDictionary(pol,eng);
                    break;
                case 2:
                    System.out.print("PL: ");
                    String polishWordToTanslate = scanner.nextLine();

                    System.out.println("ENG: "+dictionary.polToEng(polishWordToTanslate));
                    break;
                case 3:
                    dictionary.displayAll();
                    break;
            }

        } while (option != 0);
        scanner.close();
    }
}