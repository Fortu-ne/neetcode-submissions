class Solution {
    public boolean isAnagram(String s, String t) {

       if(s.isEmpty() || t.isEmpty()) return false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if(s.length() != t.length()) return false;

        Arrays.sort(sChar);
        Arrays.sort(tChar);


        return Arrays.equals(sChar,tChar);
    }
}
