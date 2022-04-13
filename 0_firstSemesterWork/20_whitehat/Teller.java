/* Joshua Yagupsky, Abdullah Faruque, Julia Kozak (Team Wires)
APCS
HW#20 -- External Audit
2021-10-19*/
/*
DISCO
Be careful when setting instance variables. If you accidentally write the data type before the variable, Java thinks you are defining a new variable and not updating the old one.
QCC
Are floats very useful? It seems like in most cases doubles work fine and are more accurate.
*/
public class Teller{
	public static void main(String[] args){
		BankAccount ba = new BankAccount();
		ba.setName("Testing Person");
		ba.setPasswd("password1");
		ba.setPin(1025); //The PIN mutator does not work, as they created a new int PIN instead of updating the old one
		ba.setAcctNum(123456789);
		ba.setBalance((float) 100.0); //Note: Doubles are prefered for java, floats are not very accurate!
		System.out.println(ba.toString());
		ba.authenticate(123456789, "password1"); //This should test if the inputed account number and password match with the account's number and password, not a hardcoded combo of 123456789 and password123
		ba.deposit((float) 100.0);
		System.out.println(ba.toString());
		ba.withdraw((float) 100.0);
		System.out.println(ba.toString());
		ba.withdraw((float) 100000.0);
		System.out.println(ba.toString());
		ba.setAcctNum(1); //Although the setAccountNum method knows that the account number is out of range, because they did the same mistake they did for the setPin method, it doesn't get set to 999999999
		System.out.println(ba.toString());
		ba.setPin(1); //You can only set your pin to 9999 (i.e., the 'invalid' PIN), because that case doesn't have the same mistake as the case where the pin is in range.
		System.out.println(ba.toString());
	}
}
