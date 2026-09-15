class Solution {
    public int findDuplicate(int[] nums) 
    {
     int i=0;
     while(i<nums.length)
     {
        int cr = nums[i]-1;
        if(nums[i] != nums[cr])
        {
            int temp = nums[i];
            nums[i]=nums[cr];
            nums[cr] = temp;
        }
        else
        {
            i++;
        }
     }
     for(i=0 ; i<nums.length ; i++)
     {
        if(nums[i] != i+1)
        return nums[i];
     }
     return -1;
}}