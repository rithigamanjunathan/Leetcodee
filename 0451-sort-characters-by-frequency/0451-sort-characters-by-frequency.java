import java.util.*;
class Solution {
    public String frequencySort(String s) 
    {
     HashMap<Character,Integer> map = new HashMap<>();
     for(char i : s.toCharArray())
     {
        map.put(i,map.getOrDefault(i,0)+1);
     }
     List<Character> lis = new ArrayList<>(map.keySet());
     lis.sort((a,b) -> map.get(b) - map.get(a));
     StringBuilder result = new StringBuilder();
     for(char c : lis)
     {
        for(int i=0 ; i<map.get(c) ; i++)
        {
            result.append(c);
        }
     }
     return result.toString();
    }
}