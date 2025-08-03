class Solution {
    public int maxSubArray(int[] nums) {
    //    int maxi = Integer.MIN_VALUE;
    //     int n = nums.length;
    //     for(int i=0; i<n; i++)
    //     {
    //             int sum =0;
    //         for( int j = i;j<n;j++)
    //         {
            
    //           sum+=nums[j];
             
    //           maxi= Math.max(maxi,sum);
    //         }
            
    //     }
    //      return maxi;
  for(int i = 1; i < nums.length; i++)
  {
    if(nums[i-1] > 0)
    {
        nums[i] += nums[i - 1];
    }
    if(nums[i] > nums[0])
    {
        nums[0] = nums[i];
    }
  }
  return nums[0];
 }
       
 }
