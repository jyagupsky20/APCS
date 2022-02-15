/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class Triangle{
  public static int triangle(int rows){
    if (rows==0){
      return 0;
    }
    return rows + triangle(rows-1);

  }
}
