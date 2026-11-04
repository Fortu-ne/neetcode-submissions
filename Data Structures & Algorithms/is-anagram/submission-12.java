class Solution {
    public boolean isAnagram(String s, String t) {

 if(s.length() != t.length()) return false;
        
        char[] s_Char = s.toCharArray();
        char[] t_Char = t.toCharArray();

        Arrays.sort(s_Char);
        Arrays.sort(t_Char);



        return Arrays.equals(s_Char, t_Char);


    }
}
