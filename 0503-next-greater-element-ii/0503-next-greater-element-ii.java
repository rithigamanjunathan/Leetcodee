class Solution {
    public int[] nextGreaterElements(int[] nums)
    {
      int n = nums.length;
      Stack<Integer> stack =new Stack<>();
      int[] arr = new int[n];
      for(int i=0 ; i<n ; i++)
      {
            arr[i] = -1;
      }
      for(int i=0 ; i<2*n ; i++)
      {
        while(!stack.isEmpty() && nums[stack.peek()] < nums[i%n])
        { 
          int prev = stack.pop();
          arr[prev] = nums[i%n];
        }
        if(i<n) stack.push(i);
      }
      return arr;
    }
}