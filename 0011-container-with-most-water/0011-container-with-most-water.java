class Solution {
    public int maxArea(int[] height) 
    {
      int max =0,width;
      int h,area;
      int left = 0 , right= height.length-1;
      while(left<right)
      {
        width = right - left ;
        h = Math.min(height[left],height[right]);
        area = width * h;
        max = Math.max(area,max);
        if(height[left]<height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
      }
      return max;


}
}