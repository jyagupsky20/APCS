/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class noX{
  public String noX(String str) {
    if (str.length() == 0){
      return "";
    }
    else if (str.substring(0,1).equals("x")){
      return noX(str.substring(1));
    }
    else {
      return str.substring(0,1) + noX(str.substring(1));
    }
  }
}
