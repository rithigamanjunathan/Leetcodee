class Solution {
    public int countSubstrings(String s) 
    {
    int count = 0 ;
      for(int i=0 ; i < s.length() ; i++)
      {
        int left = i;
        int right = i;
         while(left >= 0 && right < s.length())
         {
        if(s.charAt(left) == s.charAt(right))
        {
           count++ ;
        }
        
        else
        {
            break;
        }
        left-- ;
        right++; 
      }
      left = i;
      right = i+1 ;
     while(left >= 0 && right < s.length())
      {
        if(s.charAt(left)== s.charAt(right))
       {
         count++ ;
       } 
       
        else
        {
            break;
        }
         left-- ;
        right++; 
      }

    }
    return count ;
}
}