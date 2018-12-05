package zoo;

public class Elephant extends Animal {

  boolean amIHungry = true; //Igor

  public Elephant(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Elephant(String name) {
    super(name);
  }

  @Override
  public boolean isHungry() {
    // hungry in __every second occasion__ when a `Worker` checks on them

    // az amIHungry olyan, mint egy kapcsolo. Minden egyes alkalommal, mikor megkerdezik, hogy ehes-e, akkor valtoztat a kapcsolon.
    //Amikor epp be van kapcsolva (minden masodik esetben), akkor true-t ad vissza, es minden masodik esetben false-t
    amIHungry = !amIHungry;
    return amIHungry;
  }
}
