/*
Team Cautious Crustaceans (Orion Roven, Joshua Yagupsky, Jonathan Song)
APCS pd7
L09 -- Some Folks Call It a Charades
2022-04-26w
time spent: 2 hrs
*/

import java.util.ArrayList;
class Animal {
  protected String name;

  public Animal(String name){
    this.name = name;
  }

  public void makeNoise(){
    System.out.println("Default animal noise created by " + this.name);
  }
}

class Dog extends Animal {
  public Dog(String name){
    super(name);
  }
  @Override
  public void makeNoise(){
    System.out.println(this.name + " barked");
  }
}

class Cat extends Animal {
  public Cat(String name){
    super(name);
  }
  @Override
  public void makeNoise(){
    System.out.println(this.name + " meowed");
  }
}

public class ActivityFive {
  public static void main(String[] args) {
    ArrayList<Animal> theList = new ArrayList<Animal>();
    theList.add(new Animal("Mr. Default Animal"));
    theList.add(new Dog("Rover"));
    theList.add(new Cat("Socks"));
    for(Animal a: theList){
      a.makeNoise();
    }
  }
}
