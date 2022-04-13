/* Joshua Yagupsky, Abdullah Faruque, Julia Kozak (Team Wires)
APCS
HW#19 -- Mo Money Mo Problems ...MORE AWESOME
2021-10-18*/
/*
DISCO
Remember to always check string equality with the .equals() method, not with ==
QCC
*/
public class BankAccount {

  //instance variables
  private String name;
  private String passwd;
  private short pin;
  private int acctNum;
  private double balance;
  //---------------------------------------------


  //mutators
  public String setName( String newName ) {
    String oldName = name;
    name = newName;
    return oldName;
  }

  public String setPasswd( String newPasswd ) {
    String oldPasswd = passwd;
    passwd = newPasswd;
    return oldPasswd;
  }

  public short setPin( short newPin ) {
    short oldPin = pin;
    if((((short) 1000)<= newPin)&&(newPin <= ((short) 9998))){
      pin = newPin;
    }
    else {
      pin = ((short) 9999);
      System.out.println("Error: PIN out of range");
    }
    return oldPin;
  }

  public int setAcctNum( int newAcctNum ) {
    int oldAcctNum = acctNum;
    if((100000000<= newAcctNum) && (newAcctNum <= 999999998)){
      acctNum = newAcctNum;
    }
    else {
      acctNum = 999999999;
      System.out.println("Error: Account number out of range");
    }
    return oldAcctNum;
  }

  public double setBalance( double newBalance ) {
    double oldBalance = balance;
    balance = newBalance;
    return oldBalance;
  }
  //---------------------------------------------


  public void deposit( double depositAmount ) {
    balance = balance + depositAmount;
  }

  public boolean withdraw( double withdrawAmount ) {
    if(withdrawAmount <= balance){
      balance = balance - withdrawAmount;
      return true;
    }
    else{
      System.out.println("Error: You don't have that much money");
      return false;
    }
  }

  public boolean authenticate(int acct, String pass){
    if(acct == acctNum && passwd.equals(pass)){
      return true;
    }
    else{
      return false;
    }
  }

  //overwritten toString()
  public String toString() {
    String retStr = "\nAccount info:\n=======================";
    retStr = retStr + "\nName: " + name;
    retStr = retStr + "\nPassword: " + passwd;
    retStr = retStr + "\nPIN: " + pin;
    retStr = retStr + "\nAccount Number: " + acctNum;
    retStr = retStr + "\nBalance: " + balance;
    retStr = retStr + "\n=======================";
    return retStr;
  }


  //main method for testing
  public static void main( String[] args ) {
    //PHASE I
    BankAccount ba = new BankAccount();
    System.out.println(ba.setName("Bob Dole"));
		System.out.println(ba.setPasswd("password1"));
		System.out.println(ba.setPin((short) 1234));
		System.out.println(ba.setAcctNum(100300000));
		System.out.println(ba.setBalance(100.0));
		ba.deposit(200.0);
		System.out.println(ba.toString());
		ba.withdraw(100.0);
		System.out.println(ba.toString());
    //PHASE II
    //Checking account number and PIN functionality:
    System.out.println(ba.setAcctNum(1000000000));
    System.out.println(ba.toString());
    System.out.println(ba.setPin((short) 10000));
    System.out.println(ba.toString());
    //Checking withdrawing functionality
    ba.setBalance(200.0);
    System.out.println(ba.withdraw(100.0));
    System.out.println(ba.withdraw(1000.0));
    //Checking authentication
    ba.setAcctNum(111111111);
    ba.setPasswd("p");
    System.out.println(ba.authenticate(111111111, "p"));
    System.out.println(ba.authenticate(1,"p"));
  }
}
