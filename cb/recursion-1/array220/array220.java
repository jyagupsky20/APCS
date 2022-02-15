/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class array220{
  public boolean array220(int[] nums, int index) {
    if (index >= nums.length-1){
      return false;
    }
    else if (10 * nums[index] == nums[index+1]) {
      return true;
    }
    return array220(nums, index + 1);
  }
}
