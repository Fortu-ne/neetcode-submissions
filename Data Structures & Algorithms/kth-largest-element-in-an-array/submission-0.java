class Solution {
    public int findKthLargest(int[] nums, int k) {
         if(nums == null || k < 1) return 0;

        Arrays.sort(nums);

        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b)-> b - a);

        for (int n : nums){
            minHeap.add(n);
        }

        int i = 0;
        int res = 0;
        while(!minHeap.isEmpty()){
            i++;

            if( i  == k ){
                res = minHeap.poll();
                break;
            }
            minHeap.poll();


        }

        return res;
    }
}
