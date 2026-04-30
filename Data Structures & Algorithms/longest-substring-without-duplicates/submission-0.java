class Solution {
    public int lengthOfLongestSubstring(String s) {
        
    if(s.isEmpty()) return 0;

        HashSet<Character> hash = new HashSet<>();

        int max = 0;
        int n = s.length();
        int left = 0;

        for (int right = 0; right < n; right++) {
            while(hash.contains(s.charAt(right))){
                hash.remove(s.charAt(left));
                left++;
            }

            hash.add(s.charAt(right));
            max = Math.max(max, right - left + 1);
        }

          return max;
    }
}
