class Pokemon{
  private String name;
  private int hp;

  // crtl + insert
  public Pokemon() {
      this.name = "nameless";
      this.hp = 10;
      System.out.println("default constructor");
  }

  public Pokemon(String n, int h) {
//      정상작동, 가동선 떨어짐.
//      name = n;
//      hp = h;
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
}

public class PokemonGame {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon();
        Pokemon p2 = new Pokemon("Squritle", 70);
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        p1.setHp(50);
        p1.setName("Pikachu");
        System.out.println(p1.getName() + "'s health is " + p1.getHp() + ".");
        System.out.println(p2.getName() + "'s health is " + p2.getHp() + ".");
    }
}
