class Solution {
    public int[] topKFrequent(int[] nums, int k) {

     if (nums.length == 0 || k == 0) return new int[0];

        Map<Integer, Integer> freq = new HashMap<>();

        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> list =
                new ArrayList<>(freq.entrySet());

       // list.sort((a, b) -> b.getValue() - a.getValue());
        list.sort(Comparator.comparing(Map.Entry<Integer,Integer> :: getValue).reversed());

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getKey();
        }

        return res;
    }
}
