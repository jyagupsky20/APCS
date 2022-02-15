/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class Count7{
  public static int count7(int n) {
    if (n == 0) {
      return 0;
    }
    if (n % 10 != 7){
      return (0 + count7(n / 10));
    }
    else if (n % 10 == 7) {
      return ( 1 + count7(n / 10) );
    }
    return 0;

  }
}
