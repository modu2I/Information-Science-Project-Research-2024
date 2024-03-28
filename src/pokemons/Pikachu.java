package pokemons;

public class Pikachu extends Pokemon {
    public Pikachu(String name, int hp) {
        super(name, hp);
    }

    public Pikachu() {
    }

    public Pikachu(String name, int hp, NoFly noFly) {
        super(name, hp);
        super.setFlyable(noFly);
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Electric");
    }

    @Override
    public void attack() {
        System.out.println("Wide area lighting attack");
    }

    @Override
    public void attack(Pokemon targetPokemon) {
        System.out.println(this.getName() + " attacks " + targetPokemon.getName() + " with 100k wolts of electricity");
    }
}
