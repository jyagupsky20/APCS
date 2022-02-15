/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class endX{
  public String endX(String str) {
    if (str.length() == 0){
      return str;
    }
    else if (str.charAt(0) == 'x'){
      return endX(str.substring(1)) + 'x';
    }
    else{
      return str.charAt(0) + endX(str.substring(1));
    }
  }
}
