/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class allStar{
  public String allStar(String str) {
    if (str.length() < 2){
      return str;
    }
    return str.substring(0,1) + "*" + allStar(str.substring(1));
  }
}
