class Solution {
    public int minDeletions(String s) 
    {
      HashMap<Character,Integer> map = new HashMap<>();
      for(int i=0 ; i<s.length() ; i++)
      {
     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
      }
      int count=0;
      HashSet<Integer> set = new HashSet<>();
      for(int i : map.values())
      {
        while(i>0 && set.contains(i))
        {
            i--;
            count++;
        }
        set.add(i);
      }
    return count;
    }
}