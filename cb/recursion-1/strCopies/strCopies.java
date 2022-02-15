/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class strCopies{
  public boolean strCopies(String str, String sub, int n) {
    if (n == 0){
      return true;
    }
    else if (str.length() < sub.length()){
      return false;
    }
    else if (str.substring(0,sub.length()).equals(sub)){
      return strCopies(str.substring(1), sub, n-1);
    }
    else{
      return strCopies(str.substring(1), sub, n);
    }
  }
}
