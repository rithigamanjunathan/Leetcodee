class Solution {
    public int numOfSubarrays(int[] arr) 
    {
    int odd = 0;
    int even = 1;
    int sum =0;
 
    long count = 0;
    int MOD = 1_000_000_007 ;
     for(int num : arr)
     {
        sum += num ;
        if(sum%2==0)
        {
            count+=odd;
            even++;
        }
        else
        {
            count+=even;
            odd++;
        }
        count%=MOD;
     }
     
    return(int)count;
    }
   
}
    