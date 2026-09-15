class Solution {
    public List<Integer> findDuplicates(int[] nums) 
    {
     List <Integer> list = new ArrayList<>();
     int i=0;
     while(i<nums.length)
     {
        int cr = nums[i]-1;
        if(nums[i] != nums[cr])
        {
            int temp = nums[i];
            nums[i] = nums[cr];
            nums[cr] = temp;
        }
        else
        {
            i++;
        }
     }
     for(i=0 ; i<nums.length ; i++)
     {
        if(nums[i]!=i+1)
        list.add(nums[i]);
     }
     return list;
    }
}