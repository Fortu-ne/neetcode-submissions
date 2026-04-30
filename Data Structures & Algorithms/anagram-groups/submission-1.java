class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
         Map<String, List<String>> hash = new HashMap<>();



        if(strs.length == 0) return new ArrayList<>();

        for (String word : strs){

            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String newWord = new String(letters);
            List<String> list = new ArrayList<>();

            if(hash.containsKey(newWord)){

                hash.get(newWord).add(word);
                
               


            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(word);
                hash.put(newWord,newList);
            }

        }

         return new ArrayList<>(hash.values());


    }
}
