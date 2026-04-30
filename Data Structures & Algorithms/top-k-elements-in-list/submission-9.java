class Solution {
    public int[] topKFrequent(int[] nums, int k) {
          if(nums.length < 1 || k < 1) return null;

        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] res = new int[k];

        for (int n : nums) {
            hash.put(n,hash.getOrDefault(n,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());

        for (int i = 0; i < k ; i++) {
            res[i] = list.get(i).getKey();
        }




        return res;  
    }
}
