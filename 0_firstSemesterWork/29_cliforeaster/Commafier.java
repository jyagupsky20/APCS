//Julia Kozak, Joshua Yagupsky, Abdullah Faruque
//APCS
//HW29 -- Which Way Do You Roll?
//2021-11-01
//Time spent: 0.9hrs

/*
DISCO: Integer.parseInt(<string>) turns a string representation of an integer into an integer
       Arrays: you can define the values of each term in an array using a for loop
               the main method takes an array of Strings called args
QCC:
*/

public class Commafier {
  public static String commafyR(int n) {
    String nstring = Integer.toString(n);
    int length = nstring.length();
    if (length <= 3) {
      return nstring;
    } else {
      String rstring = nstring.substring(0, length-3);
      int rInt = Integer.parseInt(rstring);
      return commafyR(rInt) + "," + nstring.substring(length-3, length);
    }
  }

/* no "for each"
  public static String commafyF(int n) {
    String result = "";
    String nstring = Integer.toString(n);
    int length = nstring.length();
    for (int i = 0; i < length; i++) {
      String num = nstring.substring(i, i+1);
      int place  = length - i;
      if (place % 3 == 0 && i != 0) {
        result = result + "," + num;
      } else {
        result = result + num;
      }
    }
    return result;
  }
*/

  public static String commafyF(int n) {
    String result = "";
    String nstring = Integer.toString(n);
    int length = nstring.length();
    String[] m = new String[length];
    for (int i = 0; i < length; i++) {
      m[i] = nstring.substring(i, i+1);
    }
    for (int j = 0; j < length; j++) {
      // add comma before the end of each digit that is 0 mod 3 from the end
      int place = length - j;
      if (place % 3 == 0 && j != 0) {
        result = result + "," + m[j];
      } else {
        result = result + m[j];
      }
    }
    return result;
  }


  public static void main(String[] args) {
    System.out.println(commafyR(1003));
    System.out.println(commafyR(35187951));
    System.out.println(commafyF(351187951));
    for (String s: args) {
      String result = "";
      int length = s.length();
      String[] m = new String[length];
      for (int i = 0; i < length; i++) {
        m[i] = s.substring(i, i+1);
      }
      for (int j = 0; j < length; j++) {
        // add comma before the end of each digit that is 0 mod 3 from the end
        int place = length - j;
        if (place % 3 == 0 && j != 0) {
          result = result + "," + m[j];
        } else {
          result = result + m[j];
        }
      }
      System.out.println(result);
    }
  }
}
