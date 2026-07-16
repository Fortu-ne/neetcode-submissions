class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hash = new HashMap<>();
         int[] res = new int[k];

        if(nums.length < 1 || k < 1) return null;

        for(int num : nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());
        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());
         
       

        for(int n =0; n < k; n++){
            res[n] = list.get(n).getKey();
        }

       return res;
    }
}
