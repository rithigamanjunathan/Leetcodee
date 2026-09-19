class Solution {
    public int numberOfSubarrays(int[] nums, int k) 
    {
     HashMap<Integer,Integer> map = new HashMap<>();
     int prefixsum=0,count = 0;
     map.put(0,1);
     for(int i : nums)
     {
        if(i%2==1)
        prefixsum+= 1;
        else
        prefixsum+=0 ;

        int remove = prefixsum - k ;
        if(map.containsKey(remove))
        {
            count+=map.get(remove);
        }
        map.put(prefixsum,map.getOrDefault(prefixsum,0)+1);
     }
     return count;
    }
}