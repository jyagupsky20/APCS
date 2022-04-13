// Abdullah Faruque, Julia Kozak, Joshua Yagupsky (Team Wires)
// APCS
// HW26: GCD Three Ways
// 2021-27-20
// time spent: 0.3 hours

/*
QCC:
Is there an easy way to "swap" the values of two variables without creating a helper variable?
DISCO:
You can find the min of two numbers easily by taking their sum and subtracting the max. This avoids having to create a minimum method.
ALGO:
1) Sort the numbers so that the first one is the larger of the two.
2) If these numbers are multiples of each other, than we are done, and we simply return the smaller of the two.
3) If they're not, we know that repeated subtraction preserves the gcd. So we can repeatedly subtract the smaller from the larger until the larger is no longer the larger. The quick way to do this is to use the modulo operator.
4) Using the old smaller number as the new larger and the modulo of the larger with the smaller as the new smaller, return to step 2.
*/

public class Stats {
  //GCD METHODS--------------------------
  public static int gcd(int a, int b){
    int i = b;
    while (!(a%i==0 && b%i==0)){
      i--;
    }
    return i;
  }
  public static int gcdER(int a, int b){
    int c = max(a,b);
    int d = a+b-c; //c is the max of {a,b}, d is the min
    if (c%d==0){
      return d;
    }
    else{
      return gcdER(d,c%d);
    }
  }
  public static int gcdEW(int a, int b){
    int c = max(a,b);
    int d = a+b-c; //c is the max of {a,b}, d is the min
    int e;
    while (c%d != 0){
      e = c;
      c = d;
      d = e%d;
    }
    return d;
  }
  //MAIN METHOD--------------------------
  public static void main(String[] args){
    System.out.println(gcd(5,5));//Should return 5
    System.out.println(gcdER(5,5));
    System.out.println(gcdEW(5,5));
    System.out.println(gcd(5,10));//Should return 5
    System.out.println(gcdER(5,10));
    System.out.println(gcdEW(5,10));
    System.out.println(gcd(10,12));//Should return 2
    System.out.println(gcdER(10,12));
    System.out.println(gcdEW(10,12));
    System.out.println(gcd(100,8));//Should return 4
    System.out.println(gcdER(100,8));
    System.out.println(gcdEW(100,8));
  }
  //OLD CODE-----------------------------
  public static int mean(int a, int b) {
    return (((b-a)/2)+a);
  }

  public static double mean(double a, double b) {
    return (((b-a)/2)+a);
  }

  public static int max(int a, int b) {
    if(a>=b){
      return a;
    }
    else{
      return b;
    }
  }

  public static double max(double a, double b) {
    if(a>=b){
      return a;
    }
    else{
      return b;
    }
  }

  public static int geoMean(int a, int b) {
    return (int) Math.round(geoMean(a*1.0,b*1.0));
  }

  public static double geoMean(double a, double b) {
    if(a*b>= 0){
      return ((Math.sqrt(a))*(Math.sqrt(b)));
    }
    else {
      System.out.println("Only one number may be negative");
      return 0.0;
    }
  }

  public static int max(int a, int b, int c) {
    if(a>=b){
      if(a>=c){
        return a;
      }
      else{
        return c;
      }
    }
    else{
      if(b>=c){
        return b;
      }
      else{
        return c;
      }
    }
  }

  public static double max(double a, double b, double c) {
    if(a>=b){
      if(a>=c){
        return a;
      }
      else{
        return c;
      }
    }
    else{
      if(b>=c){
        return b;
      }
      else{
        return c;
      }
    }
  }

  public static int geoMean(int a, int b, int c) {
    return (int) Math.round(geoMean(a*1.0,b*1.0,c*1.0));
  }

  public static double geoMean(double a, double b, double c) {
      return ((Math.pow(a,(1.0/3.0)))*(Math.pow(b,(1.0/3.0)))*(Math.pow(c,(1.0/3.0))));
  }
}
