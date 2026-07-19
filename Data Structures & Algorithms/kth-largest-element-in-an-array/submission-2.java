class Solution {
    public int findKthLargest(int[] nums, int k) {
        int result = 0;

        if(nums.length < 1 || k < 1) return result;

       PriorityQueue<Integer> heap = new PriorityQueue<Integer>((a,b)-> b - a);

        for(int n : nums){
             heap.add(n);
        }

        int i = 0;


        while(!heap.isEmpty()){
             i++;
            if(i == k){
                result = heap.poll();
            }

            heap.poll();
            
        }

        return result;
    }


}
