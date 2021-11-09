/***
 * Clyde "Thluffy" Sinclair, Joshua "Quacker" Yagupsky, Nora Miller (Team Walrus)
 * APCS
 * L00 -- Pig Latin translation
 * 2021-11-08
 * time spent: ?hrs
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
QCC:
NEW IN v1:
We fixed the problems with the parseInput method. We also added the formatOutput method.
As of right now, the translator can handle single words.
We have yet to add punctuation functionality.
*/
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
        for (int i = 1; i < input.length(); i++) {
          if (VOWELS.contains(input.charAt(i) + "")) {
            return input.substring(i) + input.substring(0, i) + "ay";
          }
        }
        return input + "ay";
      }
    }

    public static String formatOutput(String input){
      String ret = input;
      if (ret.contains(CAPCHAR)){
        int place = ret.indexOf(CAPCHAR);
        ret = ret.substring(0,place)+ret.substring(place+1);
        ret = ret.substring(0,1).toUpperCase() + ret.substring(1);
      }
      if (ret.contains(YCHAR)){
        int place = ret.indexOf(YCHAR);
        ret = ret.substring(0,place)+"y"+ret.substring(place+1);
      }
      return ret;
    }
    public static String engToPig(String input){
      return formatOutput(translate(parseInput(input)));
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
    // public static boolean hasPunc( String w ) {
    //
    // }


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


  public static void main( String[] args ) {

    // for( String word : args ) {
    //   System.out.println( "allVowels \t" + allVowels(word) );
    //   System.out.println( "firstVowels \t" + firstVowel(word) );
    //   System.out.println( "countVowels \t" + countVowels(word) );
    //   System.out.println( "engToPig \t" + engToPig(word) );
    //   System.out.println( "---------------------" );
    // }

    System.out.println( engToPig("Apples") ); // Applesway
  	System.out.println( engToPig("String") ); // Ingstray
  	System.out.println( engToPig("pig") ); // igpay
  	System.out.println( engToPig("my") ); // ymay
  	System.out.println( engToPig("psychology") ); // ychologypsay
  	System.out.println( engToPig("yonder") ); // onderyay
  	System.out.println( engToPig("i") ); // i
    System.out.println( engToPig("payday") ); // aydaypay
    System.out.println( engToPig("tyrant") ); // yranttay
    System.out.println( engToPig("myanmar") ); // yanmarmay



  }//end main()

}//end class Pig
