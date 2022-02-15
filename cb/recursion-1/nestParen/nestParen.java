/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class nestParen{
  public boolean nestParen(String str) {
    if (str.equals("")){
      return true;
    }
    else if ( str.charAt(0) == '(' && str.charAt(str.length()-1) == ')' ){
      return nestParen(str.substring(1,str.length()-1));
    }
    else{
      return false;
    }
  }
}
