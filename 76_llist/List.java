// Team Something Important: Joshua Yagupsky, Jaylen Zeng, Jonathan Song
//APCS pd7
//HW76 -- We Got a Little Ol' Convoy
//2022-03-14
//time spent: 0.5hr
/*
DISCO:
You can do for loops with more than just integers. All you need is an initialization of a variable, an ending condition, and an incrementation operation.
QCC:

*/

/***
 * interface List
 * subset of actual Java List interface
 * Specifies actions a List must be able to perform.
 *
 * If placed in current working dir, will be consulted instead of
 *  built-in Java library interface.
 **/

public interface List
{
  //add node to list, containing input String as its data
  public boolean add( String x );

  //return data in element at position i
  public String get( int i );

  //overwrite data in element at position i
  public String set( int i, String x );

  //return length of list
  public int size();

}//end interface
