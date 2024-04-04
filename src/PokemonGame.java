import pokemons.*;

import java.util.Random;
import java.util.Scanner;

public class PokemonGame {
    public static void main(String[] args) {
        Random random = new Random();
        random.setSeed(31);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose your pokemon.\n1) Pikachu(default) 2) Squirtle 3) Charizard : ");
        int select = scanner.nextInt();

        Pokemon playerPokemon, wildPokemon;
        if(select == 1)
            playerPokemon = new Pikachu("Pikachu",50);
        else if (select == 2)
            playerPokemon = new Squirtle("Squirtle",55);
        else if (select == 3)
            playerPokemon = new Charizard("Charizard",74);
        else
            playerPokemon = new Pikachu("Pikachu",50);

        System.out.println("A wild pokemon has appeared.");
        select = random.nextInt(3);
        if(select == 0)
            wildPokemon = new Pikachu("Pikachu",50);
        else if(select == 1)
            wildPokemon = new Squirtle("Squirtle",55);
        else if (select == 2)
            wildPokemon = new Charizard("Charizard",74);
        else
            wildPokemon = new Pikachu("Pikachu",50);

//        int randomValue = random.nextInt(100) + 1;

        while(true){
            System.out.print("Game Menu\n1) Battle 2) Run away 3) Quit : ");
            int menu = scanner.nextInt();
            if(menu == 3) {
                System.out.println("Exit the program");
                break;
            }
            else if (menu == 1) {
                playerPokemon.attack(wildPokemon);
            }
            else if (menu == 2) {
                System.out.println("The player's Pokemon runs away.");
            }

        }
    }
}
