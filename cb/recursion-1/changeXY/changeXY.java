/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class changeXY{
  public String changeXY(String str) {
    if (str.equals("x")){
      return "y";
    }
    else if(str.length() <= 1){
      return str;
    }
    else{
      return changeXY(str.substring(0,1)) + changeXY(str.substring(1));
    }
  }
}
