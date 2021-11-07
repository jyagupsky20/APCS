import java.util.Arrays;
public class Lists {
  public static double[] powArray(double[] values, double power){
    double[] output = Arrays.copyOf(values, values.length);
    int i = 0;
    for(double value : output){
      output[i] = Math.pow(value, power);
      i++;
    }
    return output;
  }
  public static int indexOfMax(int[] input){
    int index = 0;
    for(int i = 0; i < input.length; i++){
      if (input[i] > input[index]){
        index = i;
      }
    }
    return index;
  }
  public static boolean[] seive(int n){
    boolean[] result = new boolean[n];
    for(int i = 0; i< n; i++){
      result[i] = true;
    }
    for(int divisor = 2; divisor <= n; divisor++){
      for (int i = divisor*2; i <= n; i+=divisor){
        result[i-1] = false;
      }
    }
    return result;
  }
  public static void main(String[] args){
    double[] theDoubles = {1.0,2.0,3.0,4.0,5.0};
    int[] theInts = {1,2,3,2,5,4,1};
    System.out.println(Arrays.toString(powArray(theDoubles,2.0)));
    System.out.println(indexOfMax(theInts));
    String r = Arrays.toString(seive(20));
    System.out.println(r);
  }
}
