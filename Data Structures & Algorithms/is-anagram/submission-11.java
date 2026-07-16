class Solution {
    public boolean isAnagram(String s, String t) {

     if(s.length() < 1 || t.length() < 1 || t.length()!= s.length()) return false;

     char[] sChar = s.toCharArray();
     char[] tChar = t.toCharArray();

     Arrays.sort(sChar);
     Arrays.sort(tChar);

    
        return Arrays.equals(sChar,tChar);
    }
}
