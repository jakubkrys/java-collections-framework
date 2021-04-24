package pl.jakubkrys.webinar_collection;

import java.util.*;

public class WebinarMain {
    public static void main(String[] args) {

        Set<Webinar> webinars = new TreeSet<>(new WebinarComparator());
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            option = menu(scanner);

            switch (option){
                case 1:
                    Webinar webinar = insertWebinar(scanner);
                    webinars.add(webinar);
                    break;
                case 2:
                    System.out.println(webinars);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static int menu(Scanner scanner) {
        int option;
        System.out.println("----- The best webinar -----");
        System.out.println("1 - add webinar");
        System.out.println("2 - display all webinars");
        System.out.println("0 - quit");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }

    private static Webinar insertWebinar(Scanner scanner) {

        System.out.print("Date: ");
        String date = scanner.nextLine();
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Signed up: ");
        int signedUp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Present: ");
        int present = scanner.nextInt();
        scanner.nextLine();

        Webinar webinar = new Webinar(date, title, signedUp, present);
        return webinar;
    }
}
