package pl.jakubkrys.dictionary;

import java.util.*;

public class Dictionary {

    private Map<String,String> words = new TreeMap<>();

    public void addToDictionary(String pol, String eng){
        words.put(pol,eng);
    }

    public String polToEng(String pol){
        return words.get(pol);
    }

    public void displayAll(){
        var wordsIterator = words.entrySet().iterator();
        while(wordsIterator.hasNext()){
            var entry = wordsIterator.next();
            String pol = entry.getKey();
            String eng = entry.getValue();
            System.out.println(pol+" - "+eng);
        }
    }
}