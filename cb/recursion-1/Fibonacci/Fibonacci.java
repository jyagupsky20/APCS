/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class Fibonacci{
  public static int fibonacci(int n){
    if (n==0){
      return 0;
    }
    else if (n == 1){
      return 1;
    }
    return fibonacci(n-1) + fibonacci(n-2);

  }
}
