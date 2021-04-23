package pl.jakubkrys.best_webinar_ever;

import java.util.Scanner;

public class WebinarMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Webinar theBestWebinar = null;
        int option;

        do {
            option = menu(scanner);

            switch (option) {
                case 1:
                    System.out.println(theBestWebinar);
                    break;
                case 2:
                    Webinar webinar = insertWebinar(scanner);
                    //theBestWebinar = compareToTheBestByComparator(theBestWebinar, webinar);
                    theBestWebinar = compareToTheBestByComparable(theBestWebinar, webinar);
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static Webinar compareToTheBestByComparable(Webinar theBestWebinar, Webinar webinar) {
        if (theBestWebinar == null || (theBestWebinar.compareTo(webinar)) < 0) {
            theBestWebinar = webinar;
        }
        return theBestWebinar;
    }

    private static Webinar compareToTheBestByComparator(Webinar theBestWebinar, Webinar webinar) {
        WebinarComparator webinarComparator = new WebinarComparator();

        if ((webinarComparator.compare(theBestWebinar, webinar)) < 0) {
            theBestWebinar = webinar;
        }
        return theBestWebinar;
    }

    private static Webinar insertWebinar(Scanner scanner) {

        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Signed up: ");
        int signedUp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Present: ");
        int present = scanner.nextInt();
        scanner.nextLine();

        Webinar webinar = new Webinar(title, signedUp, present);
        return webinar;
    }

    private static int menu(Scanner scanner) {

        int option;
        System.out.println("----- The best webinar -----");
        System.out.println("1 - display the best webinar");
        System.out.println("2 - add webinar");
        System.out.println("0 - quit");
        option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
}
