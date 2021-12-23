/***
 * Walrus (Humans: Daniel Jung, Joshua Yagupsky, Ethan Lam; Ducks: Ralph, Quacker, Carl)
 * APCS
 * HW49 -- Rational Standards Compliance
 * 2021-12-22
 * time spent: 0.2hrs
 * QCC:
 * Disco:
 ***/

public class Rational implements Comparable{
	private int numerator;
	private int denominator;

	public Rational() {
		denominator = 1;
	}

	public Rational(int n, int d){
		numerator = n;
		denominator = d;
		divZero();
	}

	void divZero(){
		if(denominator == 0){
			denominator = 1;
			numerator = 0;
			System.out.println("Division by zero occured! Resetting rational to default");
		}
	}
	public boolean equals(Object o){
		if(!( o instanceof Rational)){
			return false;
		}
		Rational r = (Rational) o;
		return this.numerator*r.denominator == r.numerator*this.denominator;
	}
	public double floatValue(){
		return ((double) numerator)/((double) denominator);
	}

	public String toString() {
		return numerator + "/" + denominator;
	}

	public void multiply(Rational r) {
		numerator *= r.numerator;
		denominator *= r.denominator;
	}

	public void divide(Rational r) {
		numerator *= r.denominator;
		denominator *= r.numerator;
		divZero();
	}

	public static int gcd(int x, int y) {
		int a = x;
		int b = y;
		int c;
		while (a*b != 0) { //Are either a or b zero?
			c = a%b;
			a = b;
			b = c;
		}
		return a+b; //Return the nonzero one
	}
	public int gcd(){
		return gcd(this.numerator,this.denominator);
	}
	public void reduce(){
		int g = this.gcd();
		this.numerator /= g;
		this.denominator /= g;
	}

	public int compareTo(Object o) {
		if(!( o instanceof Rational)){
			throw new ClassCastException("\ncompareTo() input not a Rational");
		}
		Rational r = (Rational) o;
		Rational t = new Rational(this.numerator,this.denominator);
		r.reduce();
		t.reduce();
		return t.numerator*r.denominator-t.denominator*r.numerator;
	}

	public void add(Rational r) {
		this.numerator = this.numerator*r.denominator+ this.denominator*r.numerator;
		this.denominator = this.denominator*r.denominator;
	}
	public void subtract(Rational r) {
		this.numerator = this.numerator*r.denominator - this.denominator*r.numerator;
		this.denominator = this.denominator*r.denominator;
	}
}
