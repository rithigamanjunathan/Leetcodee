class Solution {
    public void sortColors(int[] nums)
    {
      int i=0;
      while(i<nums.length)
    {
        int j=0;   int temp;
        while(j<nums.length-i-1)
        {
            if(nums[j] > nums[j+1])
            {
            temp = nums[j];
            nums[j] = nums[j+1];
            nums[j+1] = temp;
            }
            j++;
        }

        i++;
    }
    }
}