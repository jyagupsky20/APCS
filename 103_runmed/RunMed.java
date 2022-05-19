/**
   Team Cautious Crustaceans :: Orion Roven, Joshua Yagupsky, Jonathan Song
   APCS pd7
   HW103 -- Erica’s Friends, Hugo, and The One in the Middle
   2022-05-18
   time spent: 1 hr
*/

import java.util.Scanner;

public class RunMed
{
  ALHeapMax lilVals;
  ALHeapMin bigVals;
  double currentMedian = 0.0;

  public RunMed(){
    lilVals = new ALHeapMax();
    bigVals = new ALHeapMin();
  }

  public double getMedian() {return this.currentMedian;}

  private void updateMedian() {
    //If one side has more elements, it contains the median as its root, since it contains one more than half of the elements.
    if (lilVals.size() > bigVals.size()) {
      currentMedian = (double) lilVals.peekMax();
    }
    else if (lilVals.size() < bigVals.size()) {
      currentMedian = (double) bigVals.peekMin();
    }
    //Otherwise, each side has the same number of elements, so we average the smallest bigVal and the biggest lilVal
    else {
      currentMedian = (lilVals.peekMax() + bigVals.peekMin()) / 2.0;
    }
  }

  public void add(int value) {
    if (value > getMedian()){
      bigVals.add(value);
    }
    else {
      lilVals.add(value);
    }
    while (bigVals.size() + 2 <= lilVals.size()) {
      bigVals.add(lilVals.removeMax());
    }
    while (lilVals.size() + 2 <= bigVals.size()) {
      lilVals.add(bigVals.removeMin());
    }
    updateMedian();
  }


}//end class
