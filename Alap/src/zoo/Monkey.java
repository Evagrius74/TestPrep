package zoo;

public class Monkey extends Animal {


  public Monkey(String name, int age, String gender) {
    super(name, age, gender);
  }

  public Monkey(String name) {
    super(name);
  }


  @Override
  public boolean isHungry() {

    // randomly hungry
    //A Math.random() egy szamot fog megadni 0 es 1 kozott. A veletlent ugy hozom be, hogy ha a random nagyobb mint 0.4, akkor ehes, kulonben nem.
    // a 0.4-et hasrautesre valasztottam ki, lehetne barmi mas is. csak egy modszer, hogyan csinalunk random szambol boolean tipusu visszateresi erteket.
    // ha az lenne a feladat, hogy 70%-ban adjon true-t, 30%-ban legyen false, akkor ez a szam 0.3 lenne. (mert 0.3-tol nagyobb szamok pont annyian vannak :) )
    return (Math.random()>0.4);

  }
}
