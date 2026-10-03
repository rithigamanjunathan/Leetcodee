class Solution 
{
    public int findUnsortedSubarray(int[] nums) 
    {
     int start = nums.length;
     int end = -1;
     Stack<Integer> left = new Stack<>();
     Stack<Integer> right = new Stack<>();
     for(int i=0;i<nums.length ; i++)
     {
        while(!left.isEmpty() &&nums[i] < nums[left.peek()])
        {
        start = Math.min(start, left.pop());;
        }
        left.push(i);
     }
     for(int j=nums.length-1 ; j>=0 ; j--)
     {
        while(!right.isEmpty() &&nums[j] > nums[right.peek()])
        {
        end = Math.max(end, right.pop());
        }
        right.push(j);     
    }
    if(end==-1) return 0;
    
    return end-start+1;
}
}