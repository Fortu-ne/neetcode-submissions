class Solution {
    public boolean isPalindrome(String s) {

        s = s.replace(" ", "");
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");


        if(s.isEmpty()) return true;

        int n = s.length();

        for (int j = 0; j < n ; j++) {
            char start = s.charAt(j);
            char end = s.charAt(n -1);

            if(start != end){
                return false;
            }
               
            n--;
        }


          return true;
    }
}
