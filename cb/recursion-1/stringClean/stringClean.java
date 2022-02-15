/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class stringClean{
  public String stringClean(String str) {
    if (str.length() < 2){
      return str;
    }
    else if (str.charAt(0) == str.charAt(1)){
      return stringClean(str.substring(1));
    }
    else {
      return str.charAt(0) + stringClean(str.substring(1));
    }
  }
}
