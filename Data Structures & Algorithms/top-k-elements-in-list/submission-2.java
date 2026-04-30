class Solution {
   private static int[] topKFrequent(int[] nums, int k) {

         Arrays.sort(nums);

        if(k < 2){
            return new int[]{nums[0]};
        }

        if(nums.length == 0) return null;



        HashMap<Integer,Integer> hash = new HashMap<>();
        int[] result = new int[k];

        for(int n : nums){

            if(hash.containsKey(n)){
                hash.put(n,hash.get(n) + 1);
            }else{
                hash.put(n,1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());

        // Comparables

        list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());

        for (int i = 0; i < k; i++) {

            result[i] = list.get(i).getKey();
        }

        return  result;


    }
}
