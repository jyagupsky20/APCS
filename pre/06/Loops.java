public class Loops {
  public static double power(double base, int exponent){
    double out = 1;
    for(int i = 1; i <= exponent; i++) {
      out *= base;
    }
    return out;
  }
  public static int factorial(int x) {
    int out = 1;
    for(int i = 1; i <= x; i++) {
      out *= i;
    }
    return out;
  }
  public static double myexp(double x, int n){
    double out = 0;
    for(int i = 0; i <= n; i++){
      out += Math.pow(x, i)/((double) factorial(i));
    }

    return out;
  }
  public static void main(String[] args){
    System.out.println(power(5.5,2));
    System.out.println(factorial(5));
    System.out.println(myexp(1,20));
  }
}
