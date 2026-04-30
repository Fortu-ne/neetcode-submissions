class Solution {
    public List<List<Integer>> combine(int n, int k) {

      List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> sub = new ArrayList<>();
        
        if(n == 0)  return res;
       

        dfs(1,sub,res,k,n);

        return  res;
    }

    public void dfs(int index, ArrayList<Integer> sub, List<List<Integer>> res,int k, int n){


        if(index > n){
            
         if(sub.size() == k){
            
            res.add(new ArrayList<>(sub));
        }
            return; 
        }


        sub.add(index);
        dfs(index + 1, sub,res,k,n);
        sub.remove(sub.size() -1);
        dfs(index+ 1, sub,res,k,n);

    }

  
}