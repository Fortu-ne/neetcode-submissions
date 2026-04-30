class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    HashMap<Integer,Integer> hash = new HashMap<>();
        int[] new_arr = new int[k];
        
        if(nums.length < 1) return new int[]{nums[0]};
        
        if(nums.length == 0) return null;

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
        }
        
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());
        
        list.sort(Comparator.comparing(Map.Entry<Integer,Integer> :: getValue).reversed());


        for (int i = 0; i < k; i++) {
            new_arr[i] = list.get(i).getKey();
        }
        
        return new_arr;
    }
}
