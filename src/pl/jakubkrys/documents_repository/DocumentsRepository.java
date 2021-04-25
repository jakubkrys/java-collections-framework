package pl.jakubkrys.documents_repository;

import java.util.*;

public class DocumentsRepository {

    private List<Document> documents = new ArrayList<>();

    void add(Document document){
        documents.add(document);
    }

    Document getById(int id) {
        return documents.get(id-1);
    }
}