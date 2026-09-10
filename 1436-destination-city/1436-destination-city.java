class Solution {
    public String destCity(List<List<String>> paths) 
    {
      HashSet<String> set = new HashSet<String>();
      for (List<String> str : paths)
      {
        set.add(str.get(0));
      }  
      for(List<String>s : paths)
      {
        if(!set.contains(s.get(1)))
        return s.get(1);
      }
    
    return "" ;}
} 