/* Joshua Yagupsky, Nora Miller, (Los Dos Bananas)
APCS
HW#13 -- Where do BigSibs come from?
2021-10-6*/
public class BigSib {
  String helloMsg; //Initialize the message attribute
  public BigSib(String msg) { //constructor
    helloMsg = msg;
  }
  public String greet(String person){
    return helloMsg + " " + person;
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
