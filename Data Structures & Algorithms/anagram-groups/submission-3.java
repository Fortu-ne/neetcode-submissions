class Solution {
    public List<List<String>> groupAnagrams(String[] strs){
        HashMap<String, List<String>> hash = new HashMap<>();



        List<String> res = new ArrayList<>();

        if(strs == null) return new ArrayList<>();

        for (int i = 0; i < strs.length; i++) {

            char[] charKey = strs[i].toCharArray();

            Arrays.sort(charKey);
            String key = new String(charKey);

            if(hash.containsKey(key)){
                List<String> keyList = hash.get(key);
                keyList.add(strs[i]);
                hash.put(key,keyList);
            }
            else{
                List<String> newList = new ArrayList<>();
                newList.add(strs[i]);
                hash.put(key,newList);
            }
        }

        List<List<String>> result = new ArrayList<>(hash.values());





        return result ;

}
}
