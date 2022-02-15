/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class Factorial{
  public static int factorial(int n){
    if (n == 0) {
      return 1;
    }
    else {
      return n*factorial(n-1);
    }
  }
}
