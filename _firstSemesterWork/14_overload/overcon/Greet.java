/* Joshua Yagupsky, Nora Miller, Gabriel Thompson
APCS
HW#14 -- Customize your creation
2021-10-7*/
public class Greet {
  public static void main(String[] args) {
    String greeting;
    BigSib richard = new BigSib();
    BigSib grizz = new BigSib();
    BigSib dotCom= new BigSib();
    BigSib tracy = new BigSib();
    greeting = richard.greet("freshman");
    System.out.println(greeting);
    greeting = tracy.greet("Dr. Spaceman");
    System.out.println(greeting);
    greeting = grizz.greet("Kong Fooey");
    System.out.println(greeting);
    greeting = dotCom.greet("mom");
    System.out.println(greeting);
  }
}
/*
DISCO
The default constructor merely returns an instance and does nothing else. This can be overloaded by creating a constructor that takes no parameters.
QCC
*/
