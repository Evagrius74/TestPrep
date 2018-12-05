package zoo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Worker {
//  _Properties:__
//- a `name`,
//- an `animalsToLookAfter` list of containing the animals that they are looking after (we should be able to change this field later on)
//
//We should be able to create workers two ways:
//- providing `name`, `animalsToLookAfter`
//- or only providing `name`, when the `animalsToLookAfter` list should be an empty list
//
//  __Method:__
//- `doDailyRoutine()` - which should iterate through the worker's `animalsToLookAfter` list and feed them if it is neccesary.
// First, he/she should call the specific animal's `isHungry()` method and if it returns true,
// then call the animal's `eat()` method.

  String name;
  // ez a Mainben duplan van:
  ArrayList<Animal> animalsToLookAfter;


  public Worker(String name, ArrayList<Animal> animalsToLookAfter){
    this.name = name;
    this.animalsToLookAfter = animalsToLookAfter;
  }

  public Worker(String name){
    this(name, new ArrayList<>());
  }

  public void addAnimal(Animal animal) {
    animalsToLookAfter.add(animal);
  }


  public void doDailyRoutine(){
    for(int i=0; i<animalsToLookAfter.size(); i++){
      if(animalsToLookAfter.get(i).isHungry()){
        animalsToLookAfter.get(i).eat();
      }
    }

  }

  public String toString() {

    String animalStatuses = "";
    for (Animal animal:animalsToLookAfter) {
      animalStatuses = animalStatuses + animal.toString()+"\n";
    }

    return "\nThe worker's name is " + name + " who looks after these animals: \n" + animalStatuses;


  }

}
