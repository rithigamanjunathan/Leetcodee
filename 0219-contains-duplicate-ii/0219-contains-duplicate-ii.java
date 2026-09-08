class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
      
      for(int i=0 ; i<nums.length ; i++)
      {
       
         if(map.containsKey(nums[i]))
         {
           int previous_index = map.get(nums[i]);
            int difference = i - previous_index;
         
         if(difference <= k)
         {
            return true;
         }}

        map.put(nums[i],i);
      }
     
     return false;
    }
}
    