/* Joshua Yagupsky, Nora Miller
APCS
HW#12 -- Instances of other classes
2021-10-5*/
public class BigSib {
  String helloMsg; //Initialize the message attribute
  public void setHelloMsg(String msg) {
    helloMsg = msg;
  }
  public String greet(String person){
    return helloMsg + " " + person;
  }
}
/*DISCO
Methods of an entire class are static methods. However, for methods that work on the individual instances of a class, the method should not be static.
Make sure the file name matches the class name matches the type name! I kept getting errors because my file and class names were Bigsib, while in Greet.java they were BigSib.
QCC
Can we set the hello message while we are instantiating Richard?
*/
