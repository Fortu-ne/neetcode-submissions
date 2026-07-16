class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer> hash = new HashMap<>();
        
         int[] res = new int[k];

        if(nums.length < 1 || k < 1) return null;

        for(int num : nums){
            hash.put(num,hash.getOrDefault(num,0)+1);
        }

        ////List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hash.entrySet());
        ////list.sort(Comparator.comparing(Map.Entry<Integer,Integer>::getValue).reversed());
         
       PriorityQueue<Map.Entry<Integer,Integer>> queue = new PriorityQueue<>((a,b)-> a.getValue() - b.getValue());

      for(Map.Entry<Integer,Integer> entry: hash.entrySet()){
           
           queue.add(entry);

           if(queue.size() > k){
            queue.poll();
           }
    
      }

       int n = 0;

      while(!queue.isEmpty()){
        res[n] = queue.poll().getKey(); 
        n++;
      }

        

       return res;
    }
}
