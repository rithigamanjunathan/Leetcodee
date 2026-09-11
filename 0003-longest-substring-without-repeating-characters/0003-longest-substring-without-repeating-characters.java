class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
    int max=0,l=0;
    int[] c = new int[128];
    for(int i=0 ; i<s.length() ; i++)
    {
        char ch = s.charAt(i);
        l = Math.max(l,c[ch]);
        max=Math.max(max,i-l+1);
        c[ch] = i+1;
    }
    return max;
    }
}