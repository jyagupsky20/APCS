/*
Team Lonely Person  Joshua Yagupsky
APCS
HW 24 Get It While You Can
2021-10-28
Time Spent: 0.3 hours
DISCO
QCC
*/
public class Driver {
  public static void main( String[] args ) {
      Coin mine = new Coin();
      Coin a = new Coin("quarter");
      Coin b = new Coin("quarter");
      int heads = 0;
      int matches = 0;
      while ((matches <= 65536) || (matches % 2004 != 0) || (matches == 0)){
        a.flip();
        b.flip();
        if(a.equals(b)){
          matches++;
        }
        if(a.getFace() == "heads"){
          heads++;
        }
        if(b.getFace() == "heads"){
          heads++;
        }
      }
      System.out.println(heads + " heads came up\n"+ matches + " matches occured");
  }//end main()
}//end class
