public class sumDigits{
  public static int sumDigits(int n){
    if (n > 1) {
      return (n % 10) + ( sumDigits(n/10) );
    }
    return n;
  }
}
