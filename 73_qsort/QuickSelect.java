/**
Team Something Important (Joshua Yagupsky, Jaylen Zeng, Jonathan Song)
APCS pd7
HW73 -- All About the About Face
2022-03-09
time spent: 0.2 hr
**/
/**
QuickSelect algorithm:
0. Set the left bound to zero and the right bound to the index of the last element
1. Pick a pivot element (in our case, the leftmost), and partition the array using the left and right bounds. Record the final position of the pivot element.
2. If this final position is y-1, we are done. Return the pivot element.
3. If the final position is less than y-1, go to step 1 but with the left bound set to the final position plus one.
4. If the final position is greater than y-1, go to step 1 but with the right bound set to the final position minus one.
**/
public class QuickSelect{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  public static int quickSelect(int[] arr, int y){
    int rBound = arr.length-1;
    int lBound = 0;
    int temp;
    while (true){
      temp = Partition.partitionQ(arr, lBound, rBound);
      if (temp == y-1){
        return arr[y-1];
      }
      else if (temp > y-1){
        rBound = temp - 1;
      }
      else{
        lBound = temp + 1;
      }
    }
  }
  public static void main(String[] args) {
    int[] arr = {7,1,12,4,8,9,26};
    for (int i = 1; i <= arr.length; i++) {
      System.out.println(quickSelect(arr,i)); //Should print out the elements of the array from least to greatest.
    }
    //Best case scenario:
    int[] arr2 = {1,2,3,5,8,13,21,34,55,89};
    System.out.println(quickSelect(arr2, 3));
    //Worst case scenario:
    int[] arr3 = {89,55,34,21,13,8,5,3,2,1};
    System.out.println(quickSelect(arr3, 3));
  }
}
