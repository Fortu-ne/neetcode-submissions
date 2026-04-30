class Solution {
    public int findKthLargest(int[] nums, int k) {
             if(nums.length < 1 || k < 1) return 0;

        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)-> a - b);

        for(int n : nums){
            heap.offer(n);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int res = heap.poll();

        return res;
    }
}
