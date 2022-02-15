/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class countPairs{
  public int countPairs(String str) {
    if (str.length() < 3){
      return 0;
    }
    else if (str.charAt(0) == str.charAt(2)){
      return 1 + countPairs(str.substring(1));
    }
    else{
      return countPairs(str.substring(1));
    }
  }
}
