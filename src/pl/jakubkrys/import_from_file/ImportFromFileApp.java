package pl.jakubkrys.import_from_file;

import java.util.*;

public class ImportFromFileApp {
    public static void main(String[] args) {

        File file = new File();
        Set<Person> people = new HashSet<>(Arrays.asList(file.getPeople()));
        System.out.println(people);
    }
}
