/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class array6{
  public boolean array6(int[] nums, int index) {
    if (index >= nums.length){
      return false;
    }
    else if (nums[index] == 6) {
      return true;
    }
    return array6(nums, index + 1);
  }
}
