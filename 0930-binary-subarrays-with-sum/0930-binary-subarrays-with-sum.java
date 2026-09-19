class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) 
    {
     HashMap<Integer,Integer> map = new HashMap<>();
     int prefixsum = 0,count=0;
     map.put(0,1);
     for(int i : nums)
     {
      prefixsum+=i;
      int remove = prefixsum - goal;
      if(map.containsKey(remove))
      {
        count+=map.get(remove);
      }
      map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
     }    
    return count;
    }
}