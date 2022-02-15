/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class count11{
  public int count11(String str) {
    if (str.length() < 2){
      return 0;
    }
    else if (str.substring(0,2).equals("11")){
      return 1 + count11(str.substring(2));
    }
    else{
      return count11(str.substring(1));
    }
  }
}
