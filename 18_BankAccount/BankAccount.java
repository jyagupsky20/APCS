/* Joshua Yagupsky, Abdullah Faruque, Julia Kozak (Team Wires)
APCS
HW#18 -- CPA-one
2021-10-17*/
public class BankAccount {
	public static int lastID = 8128;
	public String name;
	private String password;
	private int PIN;
	private int userID;
	private int bal;
	public BankAccount(String pname, String ppassword, int pPIN, int pbal){
		userID = BankAccount.lastID;
		userID=(userID+ 1) % ((int) Math.pow(10,9));
		BankAccount.lastID += 1;
		name = pname;
		password = ppassword;
		PIN = pPIN % 10000;
		bal = pbal;
	}
	public void printInfo(int pPIN){
		if (PIN == pPIN) {
			System.out.println("ACCOUNT SUMMARY\n----------------------\nNAME: " + name + "\nUSER ID: " + userID + "\nBALANCE: $" + bal + "\nPASSWORD: " + password + "\nPIN: " + PIN);
		}
		else {
			System.out.println("PIN was incorrect");
		}
	}
	public void setBal(int pPIN, int newBal){
		if (PIN==pPIN){
			bal=newBal;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setName(int pPIN, String newName){
		if (PIN==pPIN){
			name=newName;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setPassword(int pPIN, String newPass){
		if (PIN==pPIN){
			password=newPass;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void setPIN(int pPIN, int newPIN){
		if (PIN==pPIN){
			PIN=newPIN;
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void depositMoney(int pPIN, int money){
		if (PIN==pPIN){
			if (money>0){
				bal+=money;
			}else {
				System.out.println("Cannot deposit negative amount, try again");
			}
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}
	public void withdrawMoney(int pPIN, int money){
		if (PIN==pPIN){
			if (money>0){
				bal-=money;
			}else {
				System.out.println("Input must be positive");
			}
		}
		else{
			System.out.println("PIN was incorrect");
		}
	}


	public static void main(String[] args){
		BankAccount john = new BankAccount("John Doe", "s3cr3tpassw0rd", 1234, 100000);
		john.printInfo(5432);
		john.printInfo(1234);
		john.setName(1234, "Joe");
		john.printInfo(1234);
		john.setPassword(1234,"joeiscool");
		john.printInfo(1234);
		john.setBal(1234,6969);
		john.printInfo(1234);
		john.setPIN(1234, 4321);
		john.printInfo(4321);
		john.depositMoney(4321,1);
		john.printInfo(4321);
		john.withdrawMoney(4321,6970);
		john.printInfo(4321);

	}
}
/*
DISCO:
The toString method is created by default, and gives you the string representation of an object. It can be overloaded, just like the constructor.
QCC
Q2: If we create a BankAccount.java file that simply contains a main method which only contains the line BankAccount a = new BankAccount(); the program compiles. This indicates that Java knows how to create a new bank account even though we did not explicitly create a constructor, so Java must provide a default one.
Q3: If we then add to our main() method the line System.out.println(a.toString()), we get a string representation of a, without having to define the toString method, meaning Java provides it automatically.
*/
