class Solution {
   public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0) return null;

        String string1 = strs[0];
        String result = "";




        for (int i = 1; i <= string1.length(); i++) {

            String word = string1.substring(0,i);

            for (int j = 1; j < strs.length; j++) {

                String curr = strs[j];
                if(curr.startsWith(word)){


                }
                else{
                  return  result;

                }

            }

            if(result.length() < word.length())
            {
                result = word;
            }

        }

        return result;
    }
}