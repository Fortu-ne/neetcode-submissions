class Solution {
    public String longestCommonPrefix(String[] strs) {

        if(strs == null) return "";

        StringBuilder newString = new StringBuilder();
        int i = 0;

        while (true){
            
            if(newString.length() < strs[0].length()){
                newString.append(strs[0].charAt(i));
            }
            else{
                return new String(newString);
            }


            for (int j = 0; j < strs.length; j++) {

                if(!strs[j].startsWith(new String(newString))){
                    newString.deleteCharAt(i);
                    return  new String(newString);
                }
            }
            i++;
        }


    }

}