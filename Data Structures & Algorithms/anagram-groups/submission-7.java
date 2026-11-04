class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
              if(strs.length < 1) return new ArrayList<>();

        HashMap<String,List<String>> hash = new HashMap<>();
        List<String> current = new ArrayList<String>();

       for(String s : strs){
           char[] word = s.toCharArray();
           Arrays.sort(word);

           String key = new String(word);

           if(hash.containsKey(key)){
               List<String> list = hash.get(key);
               list.add(s);
               hash.put(key,list);
           }
           else{
               List<String> ls = new ArrayList<>();
               ls.add(s);
               hash.put(key,ls);
           }


       }

        return new ArrayList<>(hash.values());
    }
}
