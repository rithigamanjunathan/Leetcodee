class Solution {
    public int longestDecomposition(String text) 
    {
     return solve(text,0,text.length()-1);
    }
    private int solve(String text,int left,int right)
    {
        if(left>right)
        return 0;
        if(left==right)
        return 1;

        for(int len=1; left+len-1 < right-len+1 ; len++)
        {
            String leftPart = text.substring(left,left+len);
            String rightPart = text.substring(right-len+1,right+1);
            if(leftPart.equals(rightPart)) return 2+solve(text,left+len,right-len);      
        }
    return 1;
    }
}