/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class countHi{
  public int countHi(String str) {
    if(str.length() < 2){
      return 0;
    }
    else if (str.substring(0,2).equals("hi")){
      return 1 + countHi(str.substring(2));
    }
    else{
      return countHi(str.substring(1));
    }
  }
}
