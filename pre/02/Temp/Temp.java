import java.util.Scanner;

public class Temp {
  public static void main(String[] args){
    final double SCALE = 1.8;
    final double OFFSET = 32.0;
    Scanner in = new Scanner(System.in);
    double degreesF;
    double degreesC;
    System.out.printf("Temperature in degrees Celsius?: ");
    degreesC = in.nextFloat();
    degreesF = degreesC*SCALE + OFFSET;
    System.out.printf("%.1f C = %.1f F \n", degreesC, degreesF);
  }
}
