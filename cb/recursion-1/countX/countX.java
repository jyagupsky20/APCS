/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class countX{
  public static int countX(String str){
    if (str.length() == 0){
      return 0;
    }
    else if (str.length() == 1){
      return (str.indexOf("x") + 1);
    }
    return countX(str.substring(0,1)) + countX(str.substring(1));
  }
}
