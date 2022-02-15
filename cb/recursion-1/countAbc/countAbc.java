/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class countAbc{
  public int countAbc(String str) {
    if (str.length() < 3){
      return 0;
    }
    else if (str.substring(0,3).equals("abc") || str.substring(0,3).equals("aba")){
      return 1 + countAbc(str.substring(1));
    }
    else{
      return countAbc(str.substring(1));
    }
  }
}
