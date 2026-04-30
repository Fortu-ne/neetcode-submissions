class Solution {
    public int[][] kClosest(int[][] points, int k) {
        
 if(points == null || k < 1) return new int[][]{{}};

        HashMap<int[],Double> hashMap =new HashMap<>();
        int x = 0;
        int y = 0;
        double distance = 0;

        for (int i = 0; i < points.length; i++) {

            int[] currentPoint = points[i];
            int n = 0;

            double val = Math.pow(currentPoint[n] - x, 2) + Math.pow(currentPoint[n + 1] - y, 2);
            distance = Math.sqrt(val);
            hashMap.put(currentPoint, distance);
        }



          PriorityQueue<Map.Entry<int[],Double>> heap = new PriorityQueue<>((a, b) ->
                Double.compare(b.getValue(), a.getValue()));

        for (Map.Entry<int[],Double> cur : hashMap.entrySet()){
            heap.add(cur);

            if(heap.size() > k){
                heap.poll();
            }
        }



        int[][] res = new int[k][2];
        int i = 0;


        while(!heap.isEmpty()){
            {
                res[i] = heap.poll().getKey();
                i++;
            }
        }


         return res;
    }
}
