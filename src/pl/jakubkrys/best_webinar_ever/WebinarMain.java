package pl.jakubkrys.best_webinar_ever;

import java.util.Scanner;

public class WebinarMain {
    public static void main(String[] args) {

        Webinar theBestWebinar = null;
        int option;

        do {
            option = menu();

            switch (option) {
                case 1:
                    System.out.println(theBestWebinar);
                    break;
                case 2:
                    Webinar webinar = insertWebinar();
                    theBestWebinar = compareToTheBestByComparator(theBestWebinar, webinar);
                    break;
            }
        } while (option != 0);
    }

    private static Webinar compareToTheBestByComparator(Webinar theBestWebinar, Webinar webinar) {
        WebinarComparator webinarComparator = new WebinarComparator();

        if ((webinarComparator.compare(theBestWebinar, webinar)) < 0) {
            theBestWebinar = webinar;
        }
        return theBestWebinar;
    }

    private static Webinar insertWebinar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Signed up: ");
        int signedUp = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Present: ");
        int present = scanner.nextInt();
        scanner.nextLine();

        Webinar webinar = new Webinar(title, signedUp, present);
        scanner.close();
        return webinar;
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        int option;
        System.out.println("----- The best webinar -----");
        System.out.println("1 - display the best webinar");
        System.out.println("2 - add webinar");
        System.out.println("0 - quit");
        option = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        return option;
    }
}
