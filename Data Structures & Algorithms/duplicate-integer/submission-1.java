class Solution {
      public static boolean hasDuplicate(int[] nums){
    
        HashSet<Integer> hash = new HashSet<>();
        
       if(nums == null) return  false;

       for(int num : nums){
           if(hash.contains(num)){
               return  true;
           }
           else{
               hash.add(num);
           }
       }
       
        
        return false;
    
    }
}