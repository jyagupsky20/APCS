/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class strCount{
  public int strCount(String str, String sub) {
    if(str.length() < sub.length()){
      return 0;
    }
    else if (str.substring(0,sub.length()).equals(sub)){
      return 1 + strCount(str.substring(sub.length()), sub);
    }
    else{
      return strCount(str.substring(1), sub);
    }
  }
}
