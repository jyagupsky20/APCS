// Team Temporary Trio of Triangles (Joshua Yagupsky, Ruby Friedman, Jomin Zhang)
// APCS pd7
// HW70 -- Thinkers of the Corn
//2022-03-4
//time spent: 0.5 hr

/***
 * class MazeSolver
 * Implements a blind depth-first exit-finding algorithm.
 * Displays probing in terminal.
 *
 * USAGE:
 * $ java Maze [path/to/mazefile]
 * (mazefile is ASCII representation of a maze, using symbols below)
 *
 * ALGORITHM for finding exit from starting position:
 * 1. If the maze is solved, exit the algorithm.
 * 2. If the hero's position is the end, the maze is solved. Exit the algorithm.
 * 3. Mark the hero's position with an @ sign.
 * 4. If the square above is a valid path or the exit, try solving the maze starting there.
 * 5. If the square to the right is a valid path or the exit, try solving the maze starting there.
 * 6. If the square below is a valid path or the exit, try solving the maze starting there.
 * 7. If the square to the left is a valid path or the exit, try solving the maze starting there.
 * 8. If none of those moves were successful, mark this square with a period and exit the algorithm.
 *
 * DISCO
 *
 * System.exit(0) forces java to stop whatever it's doing and end. Do not confuse it with return;
 * which only exits the current level of the algorithm.
 *
 * Be sure to trace through the algorithm with a test case on paper to find issues with your approach.
 *
 * You can put two classes in the same file!
 *
 * QCC
 *
 * What does the 0 in System.exit(0) represent? What happens if we replace it with something else?
 *
 * Can we convert our maze-solving algorithm into an algorithm which finds the shortest possible path?
 *
 ***/

//enable file I/O
import java.io.*;
import java.util.*;


class MazeSolver
{
  final private int FRAME_DELAY = 100;

  private char[][] _maze;
  private int h, w; // height, width of maze
  private boolean _solved;

  //~~~~~~~~~~~~~  L E G E N D  ~~~~~~~~~~~~~
  final private char HERO =           '@';
  final private char PATH =           '#';
  final private char WALL =           ' ';
  final private char EXIT =           '$';
  final private char VISITED_PATH =   '.';
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

  public MazeSolver( String inputFile )
  {
    // init 2D array to represent maze
    // (80x25 is default terminal window size)
    _maze = new char[80][25];
    h = 0;
    w = 0;

    //transcribe maze from file into memory
    try {
      Scanner sc = new Scanner( new File(inputFile) );

      System.out.println( "reading in file..." );

      int row = 0;

      while( sc.hasNext() ) {

        String line = sc.nextLine();

        if ( w < line.length() )
          w = line.length();

        for( int i=0; i<line.length(); i++ )
          _maze[i][row] = line.charAt( i );

        h++;
        row++;
      }

      for( int i=0; i<w; i++ )
        _maze[i][row] = WALL;
      h++;
      row++;

    } catch( Exception e ) { System.out.println( "Error reading file" ); }

    //at init time, maze has not been solved:
    _solved = false;
  }//end constructor


  /**
   * "stringify" the board
   **/
  public String toString()
  {
    //send ANSI code "ESC[0;0H" to place cursor in upper left
    String retStr = "[0;0H";
    //emacs shortcut: C-q, ESC
    //emacs shortcut: M-x quoted-insert, ESC

    int i, j;
    for( i=0; i<h; i++ ) {
      for( j=0; j<w; j++ )
        retStr = retStr + _maze[j][i];
      retStr = retStr + "\n";
    }
    return retStr;
  }


  /**
   * helper method to keep try/catch clutter out of main flow
   * @param n      delay in ms
   **/
  private void delay( int n )
  {
    try {
      Thread.sleep(n);
    } catch( InterruptedException e ) {
      System.exit(0);
    }
  }


  /**
   * void solve(int x,int y) -- recursively finds maze exit (depth-first)
   * @param x starting x-coord, measured from left
   * @param y starting y-coord, measured from top
   **/
  public void solve( int x, int y )
  {
    delay( FRAME_DELAY ); //slow it down enough to be followable

    //primary base case
    if (_solved) {
	    return;
    }
    //other base cases
    else if ( _maze[x][y] == EXIT) {
	    _solved = true;
      return;
    }
    //otherwise, recursively solve maze from next pos over,
    //after marking current location
    else {
	    _maze[x][y] = HERO;
      System.out.println( this ); //refresh screen
      if (_maze[x][y-1] == PATH || _maze[x][y-1] == EXIT){
        solve(x,y-1);
      }
      if (_maze[x+1][y] == PATH || _maze[x+1][y] == EXIT){
        solve(x+1,y);
      }
      if (_maze[x][y+1] == PATH || _maze[x][y+1] == EXIT){
        solve(x,y+1);
      }
      if (_maze[x-1][y] == PATH || _maze[x-1][y] == EXIT){
        solve(x-1,y);
      }
      _maze[x][y] = VISITED_PATH;
      System.out.println( this ); //refresh screen
    }
  }

  //accessor method to help with randomized drop-in location
  public boolean onPath( int x, int y) {
      return _maze[x][y] == PATH;
  }
  public int height() {
      return h;
  }
  public int width() {
      return w;
  }

}//end class MazeSolver


public class Maze
{
  public static void main( String[] args )
  {
    String mazeInputFile = null;

    try {
      mazeInputFile = args[0];
    } catch( Exception e ) {
      System.out.println( "Error reading input file." );
      System.out.println( "USAGE:\n $ java Maze path/to/filename" );
    }

    if (mazeInputFile==null) { System.exit(0); }

    MazeSolver ms = new MazeSolver( mazeInputFile );

    //clear screen
    System.out.println( "[2J" );

    //display maze
    System.out.println( ms );

    //drop hero into the maze (coords must be on path)
    // ThinkerTODO: comment next line out when ready to randomize startpos
    //ms.solve( 4, 3 );

    //drop our hero into maze at random location on path
    // YOUR RANDOM-POSITION-GENERATOR CODE HERE
    int startX = (int) (Math.random()*ms.width());
    int startY = (int) (Math.random()*ms.height());
    //System.out.println(startX + ',' + startY);
    while (!ms.onPath(startX,startY)){
          startX = (int) (Math.random()*ms.width());
          startY = (int) (Math.random()*ms.height());
          //System.out.println(startX + ',' + startY);
    }
    ms.solve( startX, startY );
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class Maze
