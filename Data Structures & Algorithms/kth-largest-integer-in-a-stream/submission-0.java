class KthLargest {

    private static int k;
    public static PriorityQueue<Integer> minHeap;
    private static int[] arrayHeap;
    
    public KthLargest(int k, int[] nums) {

        minHeap = new PriorityQueue<>();;
        this.k = k;
        arrayHeap = nums;

        for( int n : arrayHeap){
            add(n);
        }


    }
    
    public int add(int val) {
               
        minHeap.offer(val);

        if (minHeap.size() > k) {
            minHeap.poll(); // remove smallest, keep only k largest
        }

        return minHeap.peek(); // kth largest
    }
}
