/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class powerN{
  public static int powerN(int base ,int n) {
    if (n > 0){
      return base * powerN(base, n-1);
    }

    else if (n == 0){
      return 1;
    }

    return 0;

  }
}
