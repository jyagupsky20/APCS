/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class strDist{
  public int strDist(String str, String sub) {
    if (str.length() < sub.length()){
      return 0;
    }
    else if (str.substring(0,sub.length()).equals(sub) && str.substring(str.length()-sub.length()).equals(sub)){
      return str.length();
    }
    else if (str.substring(0,sub.length()).equals(sub)){
      return strDist(str.substring(0,str.length()-1), sub);
    }
    else {
      return strDist(str.substring(1), sub);
    }
  }
}
