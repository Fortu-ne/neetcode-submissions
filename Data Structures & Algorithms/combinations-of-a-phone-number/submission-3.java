class Solution {
    public List<String> letterCombinations(String digits) {

        if(digits == null || digits.isEmpty()) return new ArrayList<>();

        HashMap<Character,String> hash = new HashMap<>();
        List<String> list = new ArrayList<>();

        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");

        backtrack(0,digits, new StringBuilder(),list, hash);
        

        return list;
    }

    public void backtrack(int i, String digits, StringBuilder stringBuilder, List<String> list, Map<Character,String> hash){

        if(stringBuilder.length() == digits.length()){

            list.add(new String(stringBuilder));
            return;
        }
          
          Character currentDigit = digits.charAt(i);

        for(int n = 0; n < hash.get(currentDigit).length(); n++)
        {
            stringBuilder.append(hash.get(currentDigit).charAt(n));
            backtrack(i+1,digits,stringBuilder,list,hash);
            stringBuilder.deleteCharAt(stringBuilder.length()-1);
        }

    }
}
