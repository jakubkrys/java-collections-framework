package pl.jakubkrys.lotto;

import java.util.*;

public class Lotto {

    private static final int MIN = 1;
    private static final int MAX = 49;

    public static Set<Integer> run(){

        Set<Integer> numbers = new HashSet<>();

        do {
            int number = getRandomNumberFromRange();
            System.out.print(number+" ");
            numbers.add(number);
        } while (numbers.size() < 6);

        return numbers;
    }

    private static int getRandomNumberFromRange() {
        Random random = new Random();
        return random.nextInt(MAX - MIN) + MIN;
    }
}
