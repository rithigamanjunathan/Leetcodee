class Solution {
    public List<Integer> partitionLabels(String s)
    {
     int[] last = new int[26];
     for(int i=0 ; i<s.length() ; i++)
     {
        last[s.charAt(i)-'a'] = i ;
     }
     List<Integer> list = new ArrayList<>();
     int start=0 , end = 0;
     for(int i=0 ; i<s.length() ; i++)
     {
        end = Math.max(end, last[s.charAt(i) - 'a']);
        if(i==end) 
        {
            int size = end-start+1;
            list.add(size);
            start = i+1;
        }
     }
     return list;
    }
}