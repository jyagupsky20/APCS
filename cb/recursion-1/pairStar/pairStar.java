/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class pairStar{
  public String pairStar(String str) {
    if (str.length() < 2){
      return str;
    }
    else if(str.charAt(0) == str.charAt(1)){
      return str.charAt(0) + "*" + pairStar(str.substring(1));
    }
    return str.substring(0,1) + pairStar(str.substring(1));
  }
}
