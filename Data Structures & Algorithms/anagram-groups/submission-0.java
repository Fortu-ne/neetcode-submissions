class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length < 0 ) return  null;


        Map<String, List<String>> hash = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();


        for(String word : strs){

            char[] letters = word.toCharArray();

            Arrays.sort(letters);
            String letter  = new String(letters);

            System.out.print(letter + " ");

            if(hash.containsKey(letter)){

                hash.get(letter).add(word);

            }
            else{
                ArrayList<String> newList = new ArrayList<>();
                newList.add(word);
                hash.put(letter, newList);
            }


        }



        return new ArrayList<>(hash.values());
    }
}
