class Solution {
    public boolean isAnagram(String s, String t) {

         char[] s1 = s.toCharArray();

        char[] t1 = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        String newS = new String(s1);
        String newT = new String(t1);
        
          if(newS.equals(newT))
        {
            return true;
        }


        return false;




    }
}
