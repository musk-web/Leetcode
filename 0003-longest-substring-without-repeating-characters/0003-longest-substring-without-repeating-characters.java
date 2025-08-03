class Solution {
    public int lengthOfLongestSubstring(String s) {
     HashSet<Character> set = new HashSet<>();
     int left = 0; 
     int maxLength = 0;
     int n = s.length();
     for(int right= 0; right < n; right++)
     {
           while(set.contains(s.charAt(right))){
           set.remove(s.charAt(left));
            left++;
           }
           set.add(s.charAt(right));
           maxLength = Math.max(maxLength,right - left + 1);
     } 
     
      return maxLength;
    }
}
// Time Complexity : o(n);