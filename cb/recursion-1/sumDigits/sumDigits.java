/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class sumDigits{
  public static int sumDigits(int n){
    if (n > 1) {
      return (n % 10) + ( sumDigits(n/10) );
    }
    return n;
  }
}
