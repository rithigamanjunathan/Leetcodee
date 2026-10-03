class Solution {
    public int minIncrementForUnique(int[] nums) 
    {
        Arrays.sort(nums);int count=0 ;
        for(int i=1 ; i<nums.length ; i++)
        {
            int old = nums[i];
            if(nums[i] > nums[i-1])
            {
                    continue;
            }
            if(nums[i] <= nums[i-1])
            {
                nums[i] = nums[i-1]+1;
                count+= nums[i] - old;
            } 
        }
        return count;
    }
}