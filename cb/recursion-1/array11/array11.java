/*
Joshua Yagupsky, Neil Lin
APCS pd07
HW64: Revisitation
2022-02-14
time spent: 1.5 hrs
*/
public class array11{
  public int array11(int[] nums, int index) {
    if (index >= nums.length){
      return 0;
    }
    else if (nums[index] == 11) {
      return 1 + array11(nums, index + 1);
    }
    return array11(nums, index + 1);
  }
}
