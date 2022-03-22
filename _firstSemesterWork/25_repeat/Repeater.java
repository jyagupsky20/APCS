//Team Wires: Julia Kozak, Joshua Yagupsky, Abdullah Faruque
//APCS
//HW25 -- Do I repeat myself?
//2021-10-27
//Time spent: 0.4hrs

/*
* DISCO: if statements can be used for recursion, and have a base case and reduction step
* QCC: are there certain recursions that can't be done with void methods (ex. can you make a recursive void method that with print n! for input of int n)?
*/

public class Repeater {
  public static String fenceW(int numPosts) {
    String result = "";
    int maxCtr = 1;
    while (maxCtr < numPosts) {
      result = result + "|--";
      maxCtr += 1;
    }
    result = result + "|";
    return result;
  }

  public static String fenceR(int numPosts) {
    String result = "";
    if (numPosts == 1) {
      result = "|";
    } else {
      result = "|--" + fenceR(numPosts - 1);
    }
    return result;
  }
  public static void main(String[] args) {
    System.out.println(fenceW(1));
    System.out.println(fenceR(1));
    System.out.println(fenceW(10));
    System.out.println(fenceR(10));
  }
}
