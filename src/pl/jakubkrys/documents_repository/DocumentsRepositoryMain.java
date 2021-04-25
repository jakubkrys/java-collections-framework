package pl.jakubkrys.documents_repository;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class DocumentsRepositoryMain {
    private static Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
    private static DocumentsRepository documentsRepository = new DocumentsRepository();

    public static void main(String[] args) {

        int option;

        do {
            option = menu();
            switch (option){
                case 1:
                    createDocument();
                    break;
                case 2:
                    readDocumentById();
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

    private static void readDocumentById() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Document document = documentsRepository.getById(id);
        System.out.println(document);
    }

    private static void createDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Content: ");
        String content = scanner.nextLine();

        Document document = new Document(name,content);
        documentsRepository.add(document);
    }

    private static int menu() {
        System.out.println("----- Documents Repository -----");
        System.out.println("1 - create document template");
        System.out.println("2 - read document template");
        System.out.println("3 - update document template");
        System.out.println("4 - delete document template");
        System.out.println("0 - quit");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }
}

