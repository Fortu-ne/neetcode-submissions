class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        if(strs == null) return new ArrayList<>();

        HashMap<String,List<String>> hash = new HashMap<>();


        for (int i = 0; i < strs.length; i++) {
            char[] sortedArray = strs[i].toCharArray();

            Arrays.sort(sortedArray);
            String key = new String(sortedArray);

            if(hash.containsKey(key)){
                List<String> hashList = hash.get(key);
                hashList.add(strs[i]);
                hash.put(key,hashList);
            }else{
                List<String> current = new ArrayList<>();
                current.add(strs[i]);
                hash.put(key, new ArrayList<>(current));
            }
        }

        List<List<String>> result = new ArrayList<>(hash.values());


        return result; 
    }
}
