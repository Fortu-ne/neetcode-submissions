class Solution {
    public  List<String> letterCombinations(String digits) {

        if(digits.isEmpty()) return new ArrayList<>();

        List<String> list = new ArrayList<>();

        HashMap<Character,String> hash = new HashMap<>();

        hash.put('2',"abc");
        hash.put('3',"def");
        hash.put('4',"ghi");
        hash.put('5',"jkl");
        hash.put('6',"mno");
        hash.put('7',"pqrs");
        hash.put('8',"tuv");
        hash.put('9',"wxyz");

        backtrack(0,new StringBuilder(), digits,hash,list);


        return list;
    }

    private  void backtrack(int i, StringBuilder stringBuilder, String digits, HashMap<Character, String> hash, List<String> list) {
        
        if(i == digits.length()){
            list.add(new String(stringBuilder));
            return;
        }
        
        Character currDigit = digits.charAt(i);
        String letters = hash.get(currDigit);


        for (int j = 0; j < letters.length(); j++) {

            stringBuilder.append(letters.charAt(j));
            backtrack(i+1,stringBuilder,digits,hash,list);
             stringBuilder.deleteCharAt(stringBuilder.length()-1);

        }
        
    }
}
