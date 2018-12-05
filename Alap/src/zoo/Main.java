package zoo;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Animal oroszlanka = new Lion("Sorenyes", 12, "boy");
    Animal majomka = new Monkey("Ugralos", 5, "girl");
    Animal elefantka = new Elephant("Nagyfules", 26, "girl");

//    oroszlanka.isHungry();
//    oroszlanka.eat();
//
//    majomka.isHungry();
//    majomka.eat();
//
//    elefantka.isHungry();
//    elefantka.eat();

// ezzel lehet vmit kezdeni, mert mar a Workerben is benne van ?

    ArrayList<Animal> animalsToLookAfter = new ArrayList<>();
    animalsToLookAfter.add(oroszlanka);
    animalsToLookAfter.add(majomka);
    animalsToLookAfter.add(elefantka);

    Worker firstWorker = new Worker("Johny", animalsToLookAfter);

    // es kesobb barmikor hozzaadhatunk uj animalt
    firstWorker.addAnimal(new Monkey("hosszufarku", 11, "boy"));

    Worker secondWorker = new Worker("Suzy");
    secondWorker.addAnimal(new Monkey("Majmi", 3, "boy"));
    secondWorker.addAnimal(new Elephant("Oszloplabu", 6, "girl"));
    secondWorker.addAnimal(new Elephant("Ormanyos", 8, "girl"));
    secondWorker.addAnimal(new Lion("Kiraly", 15, "boy"));

    for (int i = 0; i<50; i++) {
      firstWorker.doDailyRoutine();
      secondWorker.doDailyRoutine();
    }

    System.out.println(firstWorker.toString());
    System.out.println(secondWorker.toString());

  }
}
