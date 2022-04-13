/*Joshua Yagupsky
APCS
HW#8 -- Greeting method
2021-9-30*/
public class Greet{
	public static void greet(String person){
		System.out.println("Why, hello there, " + person + ". How do you do?");
	}
	public static void main(String[] args){
		greet("Mr.Mykolyk");
		greet("Peter Stuyvesant");
		greet("Joshua Yagupsky");
		/*If you want to use a method inside of a class, the method must be static.
		Otherwise you will get an error.*/
	}
}
