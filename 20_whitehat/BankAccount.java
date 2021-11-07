/**
Sexy: Oscar Breen, Ethan Lam, Russell Goychayev
APCS
HW19: Mo Money Mo Problems ...MORE AWESOME-- adding limits to acctNum and pin
2021-10-19
**/
public class BankAccount {

  //instance variables
public String fullName;
private String passwd;


public int pin;
private int acctNum;

public float bal; //float and not double because double is too precise for this purpose
  //---------------------------------------------


  //mutators
  public void setName( String newName ) {
	// INSERT YOUR CODE HERE
	fullName = new String(newName);
  }

  public void setPasswd( String newPasswd ) {
	// INSERT YOUR CODE HERE
	passwd = new String(newPasswd);
  }


  public void setPin(int newPin ) {
	if ((newPin < 9999) && (newPin > 999)){
	// INSERT YOUR CODE HERE
	int pin = newPin;
  }
  else{
	System.out.println("invalid Pin, temporary has been installed");
	pin = 9999;
}
}
  public void setAcctNum( int newAcctNum ) {
	// INSERT YOUR CODE HERE
	if ((newAcctNum < 999999999) && (newAcctNum > 99999999))
	{
	acctNum = newAcctNum;
  }
  else{
	System.out.println("invalid AcctNum, temporary has been installed");
	int acctNum = 999999999;
}
  }

  public void setBalance( float newBalance ) {
	// INSERT YOUR CODE HERE
	bal = (float)newBalance;
  }

  public void authenticate(int acctNum ,String passwd ){
  if ((acctNum == 123456789) && (passwd == "password123"))
  {
	System.out.println("Successful credentials");
  }
  else {
	System.out.println("incorrect Account Number or Password");
  }
}
  //---------------------------------------------


  public void deposit( float depositAmount ) {
	// INSERT YOUR CODE HERE
	bal += (float)depositAmount;
  }

  public void withdraw( float withdrawAmount ) {
	// INSERT YOUR CODE HERE
	if (withdrawAmount <= bal)
	{
	bal -= (float)withdrawAmount;
	System.out.println("Successfully withdrew your money, current balance: " + bal);
  }
  else {
	System.out.println("Invalid funds for withdraw");
  }
}


  //overridden toString()
  public String toString() {
	// INSERT YOUR CODE HERE
	String infoPub;
	String infoPriv;
	infoPub = new String("Account holder's full name: " + fullName + "; "
	+ "4-digit PIN: " + pin + "; "
	+ "account bal: " + bal);
	infoPriv = new String("Account password: " + passwd + "; "
	+ "9-digit account number: " + acctNum);

	String infoAll;
	infoAll = new String(infoPub +  "; " + infoPriv);
	return infoAll;
  }


  //main method for testing
  public static void main( String[] args ) {
	// INSERT YOUR METHOD CALLS FOR TESTING HERE
	BankAccount gentleman = new BankAccount();


	System.out.println("---------------------------------------------");

	gentleman.authenticate (123456789 , "password123");

	gentleman.setName("Beef Wellington");
	System.out.println("Account holder's full name: " + gentleman.fullName);

	gentleman.setPasswd("password123");
	System.out.println("Account password: " + gentleman.passwd);//successful credentials



	gentleman.setPin(123); //is an invalid pin for test purposes
	System.out.println("4-digit PIN: " + gentleman.pin);

	gentleman.setAcctNum(12345678); //is an invalid AcctNum for test purposes
	System.out.println("9-digit account number: " + gentleman.acctNum);

	gentleman.setBalance((float)0.00);//sets bal to 0.00 units of currency
	System.out.println("account bal: " + gentleman.bal);

	gentleman.deposit((float)10.00); //deposits 10.00 units of currency. Does not tell you previous balance, present balance, or amount deposited.
	System.out.println("Successfully deposited your money, current balance: " + gentleman.bal);

	gentleman.withdraw((float)500.00); //withdraws too much for testing purposes



	System.out.println("---------------------------------------------");
	System.out.println(gentleman.toString());
	System.out.println();
	System.out.println("Come again, esteemed customer!");
	System.out.println("---------------------------------------------");
  }//end main()
}//end class BankAccount


