package pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Crrrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 12;
        System.out.println("Crrrrrrr");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Type : Water");
    }

    @Override
    public void attack() {
        System.out.println("Wide area water cannon attack");
    }

    @Override
    public void attack(Pokemon targetPokemon) {  // LSP
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with a water cannon attack");
    }
}