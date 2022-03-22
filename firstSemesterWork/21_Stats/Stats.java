// Abdullah Faruque, Julia Kozak, Joshua Yagupsky (Team Wires)
// APCS
// HW21: STAtisTically Speaking...
// 2021-10-20

/*
DISCO: Math.pow and Math.sqrt do not take integers...
QCC:
How does one convert from double to int without a typecast? The only methods Math provides can convert a float to a long or a float to an int.
*/

public class Stats {

  public static int mean(int a, int b) {
    return (((b-a)/2)+a);
  }

  public static double mean(double a, double b) {
    return (((b-a)/2)+a);
  }

  public static int max(int a, int b) {
    if(a>=b){
      return a;
    }
    else{
      return b;
    }
  }

  public static double max(double a, double b) {
    if(a>=b){
      return a;
    }
    else{
      return b;
    }
  }

  public static int geoMean(int a, int b) {
    return (int) Math.round(geoMean(a*1.0,b*1.0));
  }

  public static double geoMean(double a, double b) {
    if(a*b>= 0){
      return ((Math.sqrt(a))*(Math.sqrt(b)));
    }
    else {
      System.out.println("Only one number may be negative");
      return 0.0;
    }
  }

  public static int max(int a, int b, int c) {
    if(a>=b){
      if(a>=c){
        return a;
      }
      else{
        return c;
      }
    }
    else{
      if(b>=c){
        return b;
      }
      else{
        return c;
      }
    }
  }

  public static double max(double a, double b, double c) {
    if(a>=b){
      if(a>=c){
        return a;
      }
      else{
        return c;
      }
    }
    else{
      if(b>=c){
        return b;
      }
      else{
        return c;
      }
    }
  }

  public static int geoMean(int a, int b, int c) {
    return (int) Math.round(geoMean(a*1.0,b*1.0,c*1.0));
  }

  public static double geoMean(double a, double b, double c) {
      return ((Math.pow(a,(1.0/3.0)))*(Math.pow(b,(1.0/3.0)))*(Math.pow(c,(1.0/3.0))));
  }
}//end class
