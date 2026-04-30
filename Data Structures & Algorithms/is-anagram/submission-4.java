class Solution {
    public boolean isAnagram(String s, String t) {
     
     if(s.isEmpty() || t.isEmpty()) return false;
        if(s.length() != t.length()) return false;

        char[] t_char = t.toCharArray();
        char[] s_char = s.toCharArray();

        Arrays.sort(t_char);
        Arrays.sort(s_char);


        return Arrays.equals(t_char,s_char);


    }
}
