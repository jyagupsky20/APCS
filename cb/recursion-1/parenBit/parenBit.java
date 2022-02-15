/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class parenBit{
  public String parenBit(String str) {
    if (str.charAt(0) == '(' && str.charAt(str.length()-1) == ')'){
      return str;
    }
    else if (str.charAt(0) == '('){
      return parenBit(str.substring(0,str.length()-1));
    }
    else{
      return parenBit(str.substring(1));
    }
  }
}
