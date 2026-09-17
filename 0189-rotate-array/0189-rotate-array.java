class Solution {
    public void rotate(int[] nums, int k) 
    {
    int s=nums.length;
    k = k%s;
    int i=0,j=s-1 ;
    while( i<j)
    {
        int temp = nums[i];
        nums[i]= nums[j];
        nums[j]= temp;
        i++;j--;
    }
    int l=0,r=k-1;
     while(l<r)
    {
        int temp = nums[l];
        nums[l]= nums[r];
        nums[r]= temp;
         l++;r--;
    }
    int p=k ,q=s-1 ;
     while( p<q)
    {
        int temp = nums[p];
        nums[p]= nums[q];
        nums[q]= temp;
        p++;q--;
    }

    }
}