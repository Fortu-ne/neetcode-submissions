class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       if(strs.length == 0) return null;
        // Input: strs = ["act","pots","tops","cat","stop","hat"]

        HashMap<String, List<String>> hash = new HashMap<>();

        for(String str : strs){

            char[] char_str = str.toCharArray();

            Arrays.sort(char_str);

            String word = new String(char_str);

            if(hash.containsKey(word)){

               // Add items in itemss

                hash.get(word).add(str);


            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(str);
                hash.put(word,new ArrayList<>(newList));
            }




        }

        return new ArrayList<>(hash.values());
    }
}
