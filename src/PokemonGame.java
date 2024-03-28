import pokemons.*;

public class PokemonGame {
    public static void main(String[] args) {
        Charizard c1 = new Charizard();
        c1.setFlyable(new Wings());
        c1.performFly();
        Pikachu p1 = new Pikachu("Pikachu", 50);
        p1.setFlyable(new NoFly());
        p1.performFly();
        Rocket rocket = new Rocket();
        p1.setFlyable(rocket);
        p1.performFly();

//        c1.setName("Charizard");
//        c1.setHp(150);
//        c1.fly();
//        Pikachu p1 = new Pikachu("Pikachu", 50);
//        Squirtle s2 = new Squirtle("Squirtle", 70);
//        s2.attack(p1);
//        p1.attack(s2);
//        c1.attack();
//        c1.attack(p1);
//        c1.attack(s2);
    }
}
