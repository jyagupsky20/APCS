/**
Team Something Important (Joshua Yagupsky, Jaylen Zeng, Johnathan Song)
APCS pd7
HW72 -- So So Fast
2022-03-08
time spent: 0.3 hr

ALGO:
1. Initialize left and right search boundaries, along with a position tracking variable.
2. Partition the section of the array between the left and right search boundaries, with the left boundary as a pivot.
3. Set the tracking variable to the final position of the pivot.
4. If the tracking variable is equal to the position y would be in a sorted array, return the value of the array at that location and exit.
5. If the tracking variable is greater than the position y would be in a sorted array, update the right bound to be one less than the position. Go to step 2.
6. Otherwise, update the left bound to be one greater than the tracking variable. Go to step 2.

BEST CASE SCENARIO:
* When the array is already sorted in ascending order, we only need to do y partitions. Since we can assume y is small compared to n, and the partition algorithm is O(n), the total runtime is O(n).
WORST CASE SCENARIO:
* Likewise, the worst case scenario would be when the array is already sorted in descending order. O(n) elements will be chosen as pivots, and since the partition algorithm is O(n), the runtime is O(n^2).

DISCO:

QCC:
Does Big O notation work with more than one variable? If so, what's the formal definition?
**/
public class FastSelect{
  //Helper methods
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

  public static int partition(int[] arr, int a, int b, int c){
    int v = arr[c];
    swap(c, b, arr);
    int s = a;
    for (int i = a; i < b; i++){
      if (arr[i] < v){
        swap(s, i, arr);
        s++;
      }
    }
    swap(b, s, arr);
    return s;
  }

  public static int fastSelect(int[] arr, int y){
    int rBound = arr.length-1;
    int lBound = 0;
    int temp;
    while (true){
      temp = partition(arr, lBound, rBound, lBound);
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
      System.out.println(fastSelect(arr,i)); //Should print out the elements of the array from least to greatest.
    }
  }
}
