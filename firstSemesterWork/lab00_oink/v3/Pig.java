/***
 * Gabriel Thompson, Joshua "Quacker" Yagupsky, Nora Miller (Team Walrus)
 * APCS
 * L00 -- Pig Latin translation
 * 2021-11-08
 * time spent: 2.5hrs
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

/*
DISCO:
 - You can easily convert a char to a String by adding "" to a char. This makes it much easier to get
   a turn a char into a String with length 1.
 - You can use .toLowerCase() to convert a String to lowercase
 - Y's are treated as consonants if they are the first letter, but are treated as vowels if they are not
 - You can use the < and > operators in terminal commands to use file streams as arguments.
 - With the Scanner, you can use Scanner.next() to receive the next line of input, either from a file or typing

QCC:
 - Our procedure for exiting the Scanner prompt is a bit glitchy, and requires you to enter "exit" twice before
   it exits the program. We spent along time trying to fix this, but eventually gave up on it.
 - Our solution relied on using special characters as markers for uses of Y and capital letters. This is a bit
   botched, so how could you write an efficient program that *doesn't* use that?

HOW WE UTILIZED SCANNER DEMO:
 - We used the hasNext as the basis for our loop, so we don't get error messages once we reach the
   end of a file. To run our Scanner on a file, simply write $java Pig < [FILENAME. We also fixed the infinite loop
   from the scanner demo by allowing the user to exit by typing exit()

WHAT CAUSES THE RUNTIME ERROR IN THE SCANNER DEMO:
 - There isn't a runtime error, but there isn't a very natural way of killing the loop, since the hasNext()
   method is never false. The only way out is to do a ^C, or to close the window.

NEW IN v3:
 - Accounts for punctuation, although it assumes that all punctuation characters are at end of the word
*/
import java.util.Scanner;

public class Pig {

    private static final String VOWELS = "aeiouy";
    private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String PUNCS = ".,:;!?";
    private static final String YCHAR = "¥";
    private static final String CAPCHAR = "ç";
    /*
    The general format of our translation function is as follows:
    1. We take the user's input, and then put it through a formatting method that removes capitalization and
    makes it easier to translate (this is where the y-handling goes).
    2. We then take this formatted string and run it through a translation method.
    3. We reformat this final string so that it looks user-friendly.


    Our strategy with dealing with the letter "y":
    yellow y is consonant -> ellowyay.
    tryst y is a vowel -> ysttray.
    payday -> aydaypay
    tyrant -> yranttay
    myanmar -> anmarmyay?
    ty rant -> yranttay
    Tentative rule: Y is the first vowel if and only if it is after the first letter.
    Our strategy: When we format our input, we replace every "y" that's the first letter of a word with ¥ (option-Y).
    We then consider this a consonant.
    thryce -> ycethray


    */
    public static String parseInput(String input){
      String ret = "";

      if (! input.substring(0,1).toLowerCase().equals(input.substring(0,1))){
        ret += CAPCHAR;
      }

      if (input.toLowerCase().charAt(0) == 'y') {
        ret = YCHAR + input.substring(1)+ret;
      }
      else{
        ret = input+ret;
      }
      return ret.toLowerCase();
    }

    public static String translate(String input){
      if (VOWELS.contains(input.charAt(0) + "")) {
        return input + "way";
      }
      else {
        String punctuation = onlyPunc(input);

        for (int i = 1; i < input.length(); i++) {
          if (isAVowel(input.charAt(i) + "")) {
            String ret = "";

            for (int j = i; j < input.length(); j++) {
              if (!isPunc(input.charAt(j) + "")) {
                ret += input.charAt(j);
              }
            }

            return ret + input.substring(0, i) + "ay" + punctuation;
          }
        }
        return input + "ay";
      }
    }

    public static String formatOutput(String input){
      String ret = input;
      String punctuation = onlyPunc(input); // assumes that punctation is at the end
      if (ret.contains(CAPCHAR)){
        int place = ret.indexOf(CAPCHAR);
        ret = ret.substring(0,place)+ret.substring(place+1);
        ret = ret.substring(0,1).toUpperCase() + ret.substring(1);
      }
      if (ret.contains(YCHAR)){
        int place = ret.indexOf(YCHAR);
        ret = ret.substring(0,place)+"y"+ret.substring(place+1);
      }
      if (hasPunc(ret)) {
        //et += onlyPunc(ret);
      }
      return ret;
    }
    public static String engToPig(String input){
      return formatOutput(translate(parseInput(input)));
    }

    public static String onlyPunc(String word) {
      String ret = "";
      for (int i = 0; i < word.length(); i++) {
        if (isPunc(word.charAt(i) + "")) {
          ret += word.charAt(i);
        }
      }
      return ret;
    }

    /*=====================================
      boolean isPunc(String) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
      return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
      return CAPS.indexOf(letter) != -1;
    }


    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc(“cat.”) -> true
            hasPunc(“cat”) -> false
      =====================================*/
    public static boolean hasPunc( String w ) {
      for (int i = 0; i < w.length(); i++) {
        if (isPunc(w.charAt(i) + "")) {
          return true;
        }
      }
      return false;
    }


    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {
      return isUpperCase(w.substring(0,1) );
    }

    /**
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p") -> false
  **/

  public static boolean isAVowel( String letter ) {
    if ( hasA( VOWELS, letter) ) {
      return true;
    } else {
      return false;
    }
  }
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

  public static String allVowels(String w){
    String justVowels = "";
    for (int i = 0; i < w.length(); i++) {
      if (isAVowel(w.toLowerCase().charAt(i)+"" ) ) {
        justVowels += w.substring(i, i+1);
      }
    }
    return justVowels;
  }
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

  public static String firstVowel(String w){
    for (int i = 0; i < w.length(); i++) {
      if (isAVowel(w.charAt(i)+"")) {
        return w.charAt(i) + "";
      }
    }
    return "";
  }


  public static void main( String[] args ) {
    Scanner in = new Scanner(System.in);
    String word = "";
    while(in.hasNext() && !word.equals("exit")){
      word = in.next();
      System.out.println(engToPig(word));
    }

  }//end main()

}//end class Pig
