package pokemons;

public class Squirtle extends Pokemon{
    public Squirtle() {
        System.out.println("Crrrrrrr");
    }

    public Squirtle(String name, int hp) {
        super(name, hp);
        super.setFlyable(new NoFly());
        this.attackPoint = 12;
        this.skills = new String[]{"Body slam", "Water cannon", "Hydro pump"};
        this.skillPoints = new Integer[]{35, 40, 110};
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
    public void attack(Pokemon targetPokemon, int s) {  // LSP
        targetPokemon.setHp(targetPokemon.getHp() - (this.attackPoint + this.skillPoints[s]));
        System.out.println(this.getName()+ " attacks " + targetPokemon.getName() + " with a water cannon attack");
        System.out.println("The health of the wild Pokemon "+ targetPokemon.getName()+ " was reduced to "+targetPokemon.getHp()+" due to " +this.getName()+"'s attack");
    }
}