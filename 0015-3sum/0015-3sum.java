class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         //to avoid the duplicates we go for sorting 
         
        //in two pointer approach we have the left pointer and the right pointer
      



        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i <n; i++) {
            //remove duplicates:
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            //moving 2 pointers:
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j],nums[k]);
                    ans.add(temp);
                    j++;
                    k--;
                    //skip the duplicates:
                    while (j < k && nums[j] == nums[j - 1]) j++;
                    while (j < k && nums[k] == nums[k + 1]) k--;
                }
            }
        }

        return ans;
    }
}

//     public static void main(String[] args) {
//         int[] arr = { -1, 0, 1, 2, -1, -4};
//         int n = arr.length;
//         List<List<Integer>> ans = triplet(n, arr);
//         for (List<Integer> it : ans) {
//             System.out.print("[");
//             for (Integer i : it) {
//                 System.out.print(i + " ");
//             }
//             System.out.print("] ");
//         }
//         System.out.println();
//     }
// }



      
//     }
// }