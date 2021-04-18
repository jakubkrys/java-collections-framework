package pl.jakubkrys.pokemon_game;

import java.util.*;

public class PokemonApp {
    private static final int LIMIT = 10;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int round = 0;
        int option;

        while (round < LIMIT) {
            System.out.println("----- Pokemon Game -----");
            System.out.println("1 - catch'em!");
            System.out.println("2 - show current scoreboard");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option){
                case 1:
                    int playerNumber = random.nextInt(5-1)+1;
                    char pokemonName = (char)(random.nextInt(90-65)+65);

                    System.out.println(playerNumber);
                    System.out.println(pokemonName);
                    break;
                case 2:

                    break;
            }
            round++;
        }
        scanner.close();
    }
}