class Solution {
    public String reorganizeString(String s) 
    {
    HashMap<Character,Integer> map = new HashMap<>();
    for(int i=0 ; i<s.length() ; i++)
    {
      char ch = s.charAt(i);
      map.put(ch,map.getOrDefault(ch,0)+1);
    }
    PriorityQueue<Character> pr = new PriorityQueue<>
    ((a,b)-> map.get(b) - map.get(a));
    pr.addAll(map.keySet());
    
    StringBuilder ans = new StringBuilder();
    while(pr.size() > 1)
    {
        char first = pr.poll();
        char second = pr.poll();
        ans.append(first);
        ans.append(second);
        map.put(first, map.get(first) - 1);
        map.put(second, map.get(second) - 1); 
        if (map.get(first) > 0)
        pr.offer(first);
        if (map.get(second) > 0)
        pr.offer(second);
    }
    if (!pr.isEmpty())
    {
    char last = pr.poll();

    if (map.get(last) > 1)
        return "";

    ans.append(last);
    }
return ans.toString();
    }
}