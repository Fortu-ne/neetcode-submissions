class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>> hash = new HashMap<>();
        List<List<String>> list = new ArrayList<>();

        if(strs.length < 1) return null;

        for(String str : strs){
            char[] stChar = str.toCharArray();

            Arrays.sort(stChar);

            String key = new String(stChar);

            if(hash.containsKey(key)){
                List<String> current  = hash.get(key);
                current.add(str);
                hash.put(key,current);
            }
            else {
                List<String> current = new ArrayList<>();
                current.add(str);
                hash.put(key,current);
            }
        
        }

        return new ArrayList<>(hash.values());
    }
}
