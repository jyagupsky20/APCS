/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class bunnyEars2{
  public static int bunnyEars2(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    if (bunnies % 2 == 0) {
      return 3 + bunnyEars2(bunnies - 1);
    }
    else {
      return 2 + bunnyEars2(bunnies - 1);
    }
  }
}
