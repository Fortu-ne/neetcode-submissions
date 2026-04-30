class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Arrays.sort(nums);
        
        if(nums.length == 0) return null;

        if(k < 2) return new int[]{nums[0]};

        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] res = new int[k];

        for(int n : nums){

            if(hash.containsKey(n)){
                hash.put(n,hash.get(n) + 1);
            }else{
                hash.put(n,1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

        list.sort(Comparator.comparing(Map.Entry<Integer,Integer> :: getValue).reversed());



        for (int j = 0; j < k; j++) {
            res[j] = list.get(j).getKey();
        }

        return res;
    }
}
