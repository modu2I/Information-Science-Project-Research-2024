package pokemons;

public abstract class Pokemon{
    private String name;
    private int hp;

    // crtl + insert
    public Pokemon() {
        this.name = "nameless";
        this.hp = 10;
        System.out.println("default constructor");
    }

    public Pokemon(String name, int hp) {
        this.name = name;
        this.hp = hp;
        System.out.println("parameter constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void info(){
        System.out.println("NAME : " + getName());
        System.out.println("HP : " + getHp());
    }

    public abstract void attack();
}