package pokemons;

public class Charizard extends Pokemon{


    public Charizard(String name, int hp) {
        super(name, hp);
        super.setFlyable(new Wings());
        this.attackPoint = 25;
        System.out.println("Riza");
    }

    public Charizard() {
        System.out.println("Riza");
    }

    @Override
    public void attack() {
        System.out.println("Wide area fire attack");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " fires a firethrower attack at " + targetPokemon.getName());
    }
}
