class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() == 0 || s.length() == 0) return  false;
        
        char[] char_s = s.toCharArray();
        char[] char_t = t.toCharArray();
        
        Arrays.sort(char_s);
        Arrays.sort(char_t);
        
        String newS = new String(char_s);
        String newT = new String(char_t);
        
        
        
        return newS.equals(newT);

    }
}
