/* Joshua Yagupsky, Nora Miller, (Los Dos Bananas)
APCS
HW13 -- Where do BigSibs Come From?
2021-10-6*/
public class Greet {
  public static void main( String[] args ) {
    BigSib a = new BigSib("Word up");
    BigSib b = new BigSib("Salutaions");
    BigSib c = new BigSib("Hey ya");
    BigSib d = new BigSib("Sup");
    System.out.println(a.greet("freshman"));
    System.out.println(b.greet("Dr. Spaceman"));
    System.out.println(c.greet("Kong Fooey"));
    System.out.println(d.greet("mom"));
  }
}
/*DISCO
The constructor method must be public, its name must match the class name, and it does NOT have a return type.
QCC
It's important to make sure that all three of the following match:
1) The file name your class is stored in
2) The name of the class in the file
3) The type of the variable in the definition of each instance.
Due to some bad autocorrect, my keyboard really wants me to type "Bigsib" instead of "BigSib," which led to several errors.
*/
