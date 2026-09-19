class Solution {
    public int subarraySum(int[] nums, int k)
    {
     HashMap<Integer,Integer> map = new HashMap<>();
     map.put(0,1); int prefixsum=0,count=0;
     for(int i : nums)
     {
        prefixsum+=i;
        int sum = prefixsum - k;
        if(map.containsKey(sum))
        {
          count+= map.get(sum);
        }
          map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
     }
     return count;
    }
}