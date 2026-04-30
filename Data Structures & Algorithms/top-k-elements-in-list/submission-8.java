class Solution {

     private  int[] topKFrequent(int[] nums, int k) {

        if(k < 1 || nums == null) return new int[]{};

        HashMap<Integer,Integer> hash = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i],hash.getOrDefault(nums[i],0) +1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

        int[] newArr = new int[k];

        for(Map.Entry<Integer,Integer> entry : hash.entrySet()){
            heap.add(entry);
            if(heap.size()>k){
                heap.poll();
            }
        }

        int i = 0;

        while(!heap.isEmpty()){
            newArr[i] = heap.poll().getKey();
            i++;
        }

        return newArr;
    }
}
