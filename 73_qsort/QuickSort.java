/**
Team Something Important (Joshua Yagupsky, Jaylen Zeng, Jonathan Song)
APCS pd7
HW73 -- All About the About Face
2022-03-09
time spent: 0.2 hr
**/

/***
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr):
 * 1. Pick a pivot element (in our code, the leftmost element) and partition the array. Record the final location of the pivot.
 * 2. If there is a subarray left of the pivot, sort it using QuickSort.
 * 3. If there is a subarray right of the pivot, sort it using QuickSort.
 * 2a. Worst pivot choice and associated run time:
 * If the chosen pivot value is either the max value or the minimum value of the array, then you would get a runtime of O(n^2). When the pivot is the most extreme number, you would only be left with one
 * partition that contains all other elements and another one that is empty. As a result, you'll have to iterate through all n elements n times giving you a time complexting of O(n^2).
 * 2b. Best pivot choice and associated run time:
 * If the chosen pivot value is the median value of the array, you are always dividing your arrays in half, which is the most efficient. The number of arrays you will have to partition is O(log n), and since each partition is O(n), the total runtime is O(nlogn)
 * 3. Approach to handling duplicate values in array:
 * The algorithm we came up with does not require any modifications to accomodate duplicate values.
 **/

public class QuickSort
{
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
  //--------------^  HELPER METHODS  ^--------------




  /**
   * void qsort(int[])
   * @param d -- array of ints to be sorted in place
   */
  public static void qsort( int[] d )
  {
    qsortH(d, 0, d.length-1);
  }

  //you may need a helper method...
  public static void qsortH(int[] d, int left, int right) {
    int pos = Partition.partitionQ(d, left, right);
    if (pos > left){
      qsortH(d, left, pos-1);
    }
    if (pos < right){
      qsortH(d, pos+1, right);
    }
  }




  //main method for testing
  public static void main( String[] args )
  {


    //get-it-up-and-running, static test case:
    int [] arr1 = {7,1,5,12,3};
    System.out.println("\narr1 init'd to: " );
    printArr(arr1);

    qsort( arr1 );
    System.out.println("arr1 after qsort: " );
    printArr(arr1);
    // randomly-generated arrays of n distinct vals
    int[] arrN = new int[10];
    for( int i = 0; i < arrN.length; i++ )
    arrN[i] = i;

    System.out.println("\narrN init'd to: " );
    printArr(arrN);

    shuffle(arrN);
    System.out.println("arrN post-shuffle: " );
    printArr(arrN);

    qsort( arrN );
    System.out.println("arrN after sort: " );
    printArr(arrN);
    /*~~~~s~l~i~d~e~~~m~e~~~d~o~w~n~~~~~~~~~~~~~~~~~~~~ (C-k, C-k, C-y)
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/



    //get-it-up-and-running, static test case w/ dupes:
    int [] arr2 = {7,1,5,12,3,7};
    System.out.println("\narr2 init'd to: " );
    printArr(arr2);

    qsort( arr2 );
    System.out.println("arr2 after qsort: " );
    printArr(arr2);


    // arrays of randomly generated ints
    int[] arrMatey = new int[20];
    for( int i = 0; i < arrMatey.length; i++ )
    arrMatey[i] = (int)( 48 * Math.random() );

    System.out.println("\narrMatey init'd to: " );
    printArr(arrMatey);

    shuffle(arrMatey);
    System.out.println("arrMatey post-shuffle: " );
    printArr(arrMatey);

    qsort( arrMatey );
    System.out.println("arrMatey after sort: " );
    printArr(arrMatey);

  }//end main

}//end class QuickSort
