/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class Count8{
  public static int count8(int n) {
    if (n == 0) {
      return 0;
    }
    if (n % 10 != 8){
      return (0 + count8(n / 10));
    }
    else if (n % 10 == 8) {
      if (n % 100 == 88){
        return 2 + count8(n / 10);
      }
      return ( 1 + count8(n / 10) );
    }
    return 0;
  }
}
