class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) 
    {
     HashSet <Integer> set = new HashSet<>();
     List<Integer> answer = new ArrayList<>();
     for(int nu : nums)
     {
        set.add(nu);
     }
     for(int i=1 ; i<=nums.length ; i++)
     {
        if(!set.contains(i))
        {
             answer.add(i);

        }
    
     } 
   return answer ;
    }
}