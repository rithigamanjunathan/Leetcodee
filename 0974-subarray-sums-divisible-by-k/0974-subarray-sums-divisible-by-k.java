class Solution {
    public int subarraysDivByK(int[] nums, int k) 
    {
      HashMap<Integer,Integer> map = new  HashMap<>();
      int sum = 0;
      map.put(0,1);
      int answer = 0;
      for(int i=0 ; i<nums.length ; i++)
      {
        sum = sum + nums[i];
        int remainder = sum % k;
        if(remainder<0)
        {
          remainder = remainder + k;
        }
        if(map.containsKey(remainder))
        {
            answer = answer + map.get(remainder);
        }
        map.put(remainder,map.getOrDefault(remainder,0)+1);
      }
  return answer;
    }
  
}