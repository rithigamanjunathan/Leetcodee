class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
      List<Integer> list = new ArrayList<Integer>();
      if(s.length() <p.length() )
        return list;
      int[] count1  = new int[26];
      int[] count2 = new int[26];

      for(char i : p.toCharArray())
      {
        count1[i - 'a']++;
      }
      for(int i=0 ; i<p.length();i++)
      {
        count2[s.charAt(i)-'a']++;
        if(Arrays.equals(count1,count2))
        list.add(i-p.length()+1);
      }
      for(int i=p.length() ; i<s.length() ; i++)
      {
        count2 [s.charAt(i)-'a']++;

        count2[s.charAt(i-p.length())-'a']--;
        if(Arrays.equals(count1,count2))
        {
            list.add(i-p.length()+1);
        }
      }
      return list;
    }
}
     