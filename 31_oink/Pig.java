/***
 * Julia Kozak, Abdullah Faruque, Joshua Yagupsky
 * APCS
 * HW31 -- Otnay Ybay ethay Airhay Onway Ymay Inneechay Inchay Inchay
 * 2021-11-04
 * time spent: 0.4hrs
 *
 * class Pig
 * a Pig Latin translator
 * ~~~~~~~~~~~~~~~~~~~ SKELETON ~~~~~~~~~~~~~~~~~~~
 *           9
 *     ,--.-'-,--.
 *     \  /-~-\  /
 *    / )' a a `( \
 *   ( (  ,---.  ) )
 *    \ `(_o_o_)' /
 *     \   `-'   /
 *      | |---| |
 *      [_]   [_]
 *      PROTIP: Make this class compilable first,
 *      then develop and test one method at a time.
 *      NEVER STRAY TOO FAR FROM COMPILABILITY/RUNNABILITY!
 ***/

public class Pig
{
  //Q: How does this initialization make your life easier?
  //A: You can refer to the vowels without restating the string each time
  private static final String VOWELS = "aeiou";


  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    int length = w.length();
    for (int i = 0; i < length; i++) {
      String testChar = w.substring(i, i+1);
      if (testChar.equals(letter)) {
        return true;
      }
    }
    return false;
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    int length = VOWELS.length();
    for (int i = 0; i < length; i++) {
      String oneVowel = VOWELS.substring(i, i+1);
      if (letter.equals(oneVowel)) {
        return true;
      }
    }
    return false;
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    int vowelCtr = 0;
    int length = w.length();
    for (int i = 0; i < length; i++) {
      String testChar = w.substring(i, i+1);
      if (isAVowel(testChar)) {
        vowelCtr += 1;
      }
    }
    return vowelCtr;
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w )
  {
    return countVowels(w) > 0;
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    String result = "";
    int length = w.length();
    for (int i = 0; i < length; i++) {
      String testChar = w.substring(i, i+1);
      if (isAVowel(testChar)) {
        result = result + testChar;
      }
    }
    return result;
  }


  public static void main( String[] args )
  {
    System.out.println(hasA("bread", "o"));
    System.out.println(hasA("bread", "e"));
    System.out.println(isAVowel("o"));
    System.out.println(isAVowel("x"));
    System.out.println(countVowels("bread"));
    System.out.println(countVowels("bread daerb"));
    System.out.println(hasAVowel("bread"));
    System.out.println(hasAVowel("brd"));
    System.out.println(allVowels("bread"));
    System.out.println(allVowels("aeioudxadvnksape"));

  }//end main()

}//end class Pig
