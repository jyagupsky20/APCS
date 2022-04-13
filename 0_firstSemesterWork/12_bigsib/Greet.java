/* Joshua Yagupsky, Nora Miller
APCS
HW#12 -- Instances of other classes
2021-10-5*/
public class Greet {
  public static void main( String[] args ) {
    String greeting;

    BigSib richard = new BigSib();
    richard.setHelloMsg("Word up");

    greeting = richard.greet("freshman");
    System.out.println(greeting);
    richard.setHelloMsg("Salutaions");

    greeting = richard.greet("Dr. Spaceman");
    System.out.println(greeting);
    richard.setHelloMsg("Hey ya");

    greeting = richard.greet("Kong Fooey");
    System.out.println(greeting);
    richard.setHelloMsg("Sup");

    greeting = richard.greet("mom");
    System.out.println(greeting);

  }
}
/*DISCO
Methods of an entire class are static methods. However, for methods that work on the individual instances of a class, the method should not be static.
Make sure the file name matches the class name matches the type name! I kept getting errors because my file and class names were Bigsib, while in Greet.java they were BigSib.
QCC
Can we set the hello message while we are instantiating Richard?
*/
