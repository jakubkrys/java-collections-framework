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
                    Document document = readDocumentById();
                    System.out.println(document);
                    break;
                case 22:
                    System.out.println(readAllDocuments());
                    break;
                case 3:
                    updateDocument();
                    break;
                case 4:
                    deleteDocument();
                    break;
                case 5:
                    containsDocument();
                    break;
            }
        } while (option != 0);
        scanner.close();
    }

    private static List<Document> readAllDocuments() {
        return documentsRepository.readAll();
    }

    private static void containsDocument() {
        System.out.print("Name: ");
        String name = scanner.nextLine();

        Document document = new Document(name);
        boolean exist = documentsRepository.contains(document);

        if(exist){
            System.out.println("Exist");
        } else {
            System.out.println("Do not exist");
        }
    }

    private static void deleteDocument() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        documentsRepository.removeById(id);
    }

    private static void updateDocument() {
        Document document = readDocumentById();
        System.out.println(document);
        int option = updateDocumentMenu();

        switch (option){
            case 1:
                System.out.print("Name: ");
                String name = scanner.nextLine();
                document.setName(name);
                break;
            case 2:
                System.out.print("Content: ");
                String content = scanner.nextLine();
                document.setContent(content);
                break;
        }
    }

    private static int updateDocumentMenu() {
        System.out.println("1 - update name");
        System.out.println("2 - update content");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }

    private static Document readDocumentById() {
        System.out.print("ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        return documentsRepository.getById(id);
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
        System.out.println("22 - read all documents");
        System.out.println("3 - update document template");
        System.out.println("4 - delete document template");
        System.out.println("5 - check if document contains...");
        System.out.println("0 - quit");
        int option = scanner.nextInt();
        scanner.nextLine();

        return option;
    }
}