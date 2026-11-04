class Solution {
    public boolean isPalindrome(String s) {

       
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]", "");


        if(s.isEmpty()) return true;

        int left = 0;
        int right = s.length()-1;

        while(left < right){

            char leftLetter = s.charAt(left);
            char rightLetter = s.charAt(right);

            if(leftLetter != rightLetter){
                return false;
            }

            left++;
            right--;
        }

        return true;


    }
}
