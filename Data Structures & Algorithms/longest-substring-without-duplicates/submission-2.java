class Solution {
    public int lengthOfLongestSubstring(String s) {
        int best = 0;

        HashSet<Character> count = new HashSet<>();

        int l  = 0;
        
        if(s.isEmpty()) return best;

        for(int r = 0; r < s.length(); r++){
            
            while(count.contains(s.charAt(r))){
                count.remove(s.charAt(l));
                l++;
            }
        
                count.add(s.charAt(r));
                best = Math.max(best, r - l + 1);
            
        }

        return best;
    }
}
