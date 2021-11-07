/* Joshua Yagupsky, Nora Miller, Gabriel Thompson
APCS
HW#14 -- Customize your creation
2021-10-7*/
public class BigSib {
  String helloMsg;
  //default constructor
  public BigSib(){
    helloMsg="Hello";
  }
  //special constructor
  public BigSib(String msg) {
    helloMsg = msg;
  }
  public String greet(String person){
    return helloMsg + " " + person;
  }
}
/*
DISCO
The default constructor merely returns an instance and does nothing else. This can be overloaded by creating a constructor that takes no parameters.
QCC
*/
