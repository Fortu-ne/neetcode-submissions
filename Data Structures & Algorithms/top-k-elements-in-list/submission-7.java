class Solution {
    public int[] topKFrequent(int[] nums, int k) {
         if(nums == null || k == 0) return new int[]{};

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0) + 1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

         list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());

        int[] newArr = new int[k];

        for (int i = 0; i < k; i++) {
            newArr[i] = list.get(i).getKey();
        }
        
        return newArr;
    }
}
