class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

           HashMap<String,List<String>> hash = new HashMap<>();

        if(strs.length < 1) return null;

        for (String str : strs){
            char[] charStr = str.toCharArray();
            Arrays.sort(charStr);
            String word = new String(charStr);

            if(hash.containsKey(word)){
                List<String> current = hash.get(word);
                current.add(str);
                hash.put(word,current);
            }
            else{
                List<String> list = new ArrayList<>();
                list.add(str);
               hash.put(word,list);
            }
        }

        return new ArrayList<>(hash.values());
        
    }
}
