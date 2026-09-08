class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
     HashSet<Integer> set = new HashSet<>();
     List<Integer> answer = new ArrayList<>();
     for (int n1 : nums1)
     {
        set.add(n1);
     }
     for(int n2 : nums2)
     {
        if(set.contains(n2) && !answer.contains(n2) )
        {
            answer.add(n2);
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