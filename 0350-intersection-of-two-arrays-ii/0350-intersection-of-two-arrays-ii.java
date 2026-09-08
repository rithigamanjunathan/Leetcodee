class Solution {
    public int[] intersect(int[] nums1, int[] nums2) 
    {
     HashMap<Integer,Integer> map = new HashMap<>();
     List<Integer> answer = new ArrayList<>();
     for(int n1 : nums1)
     {
        map.put( n1 ,map.getOrDefault( n1,0)+1);
     }   
     for(int n2 : nums2)
     {
        if(map.containsKey(n2) && map.get(n2)>0)
        {
            answer.add(n2);
            map.put(n2,map.get(n2)-1);
        }
     }
     int[] result = new int[answer.size()];
     for(int i=0 ; i<answer.size() ; i++)
     {
        result[i] = answer.get(i);
     }
     return result;
    }
    
}