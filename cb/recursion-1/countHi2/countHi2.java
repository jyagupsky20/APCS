/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class countHi2{
  public int countHi2(String str) {
    if (str.length() < 3){
      if ( str.equals("hi") ){
        return 1;
      }
      return 0;
    }
    else if (str.substring(0,3).equals("xhi")){
      return countHi2(str.substring(3));
    }
    else if (str.substring(0,2).equals("hi")){
      return 1 + countHi2(str.substring(2));
    }
    else{
      return countHi2(str.substring(1));
    }
  }
}
