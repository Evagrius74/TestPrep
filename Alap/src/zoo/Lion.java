package zoo;

public class Lion extends Animal{


  public Lion(String name, int age, String gender) {
    super(name, age, gender);
  }

  // ha igy vannak a constructorok, akkor a default ertekek is atjonnek
  public Lion(String name) {
    super(name);
  }

  @Override
  public boolean isHungry() {
   return true;
  }
}
