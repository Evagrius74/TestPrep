package zoo;

public abstract class Animal {
//  Properties:__
//          - a `name`,
//          - an `age`,
//          - a `gender`,
//          - `fedTimes` meaning the number of times the animal got food
//
//  We should be able to create animals two ways:
//          - providing `name`, `age`, `gender`
//          - or only providing `name`, when `age` and `gender` will get default values `0` and `unknown` respectively
//
//  __Methods:__
//- `eat()` - which only increases `fedTimes`
//- `isHungry()` - which returns whether the animal is currently hungry. It should be an abstract method and implementation should depend on the type of the animal
//- `toString()` - which returns information about him/her in the format: "`name` is a `age` years old `gender` animal and was fed `fedTimes` times"
//
//  We have three different kind of animals:
//- `Lion`s, who are __always__ hungry
//- `Monkey`s , who are __randomly__ hungry
//- `Elephant`s, who are hungry in __every second occasion__ when a `Worker` checks on them


  String name;
  int age;
  String gender;
  int fedTimes = 0;

  public Animal(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }


  public Animal(String name) {
    this(name,0,"unknown");
//    this.name = name;
//    this.age = 0;
//    this.gender = "unknown";
  }

  public void eat() {
    fedTimes++;
  }

  public abstract boolean isHungry();


  public String toString() {
    return name + " is a " + age + " years old "  + gender +  " animal and was fed " + fedTimes + " times.";

  }

}
