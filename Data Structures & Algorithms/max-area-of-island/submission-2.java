class Solution {
    public int maxAreaOfIsland(int[][] grid) {

       HashSet<String> visited = new HashSet<String>();
         int maxSize = Integer.MIN_VALUE;
        int size = 0;
       if(grid.length < 1) return size;


       for(int r = 0 ; r < grid.length; r++){
        for(int c = 0; c < grid[0].length; c++){
            size = explore(r,c,visited,grid);


            if(size > maxSize){
                maxSize = size;
            }
        }
       }


        return maxSize;
    }

    private int explore (int r , int c, HashSet<String> visited, int[][] grid)
    {
        int count = 1;
        if(!inBounds(r,c,grid.length,grid[0].length)){
            return 0;
        }

        if(grid[r][c] == 0) return 0;

        String pos = r + "." + c;

        if(visited.contains(pos)) return 0;

        

        visited.add(pos);

        count += explore(r -1,c,visited,grid);
        count += explore(r +1,c,visited,grid);
        count += explore(r,c -1,visited,grid);
        count += explore(r,c + 1,visited,grid);


        return count;

    }


    private boolean inBounds(int r, int c , int rows, int cols)
   {
     return r < rows && r >= 0 && c < cols && c >= 0;
   } 

}
