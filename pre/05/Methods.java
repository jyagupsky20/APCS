public class Methods {
  public static boolean isDivisible(int dividend, int divisor){
    if (dividend % divisor == 0){
      return true;
    }
    else {
      return false;
    }
  }
  public static boolean isTriangle(double a, double b, double c){
    if ((b + c > a) && (Math.abs(b-c) < a)){
      return true;
    }
    else {
      return false;
    }
  }
  public static int ackerman(int m, int n){
    if (m == 0){
      return n+1;
    }
    else if (n == 0) {
      return ackerman(m-1,1);
    }
    else {
      return ackerman(m-1,ackerman(m,n-1));
    }
  }
  public static void main(String[] args){
    System.out.println(isDivisible(18,6));
    System.out.println(isTriangle(18,9,10));
    System.out.println(ackerman(3,2));
  }
}
