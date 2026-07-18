class Solution {
    public int numIslands(char[][] grid) {

        HashSet<String> visited = new HashSet<>();

        int count = 0;

        if(grid.length < 1) return count;

        for(int r = 0; r < grid.length; r++){
            for(int c = 0; c < grid[0].length; c++){
                if(explore(r,c,visited, grid)){
                    count+=1;
                }
            }
        }
        return count;
    }

    private boolean explore(int r, int c, HashSet<String> visited, char[][]grid)
    {
         

         String pos = r + "." + c;

         if(!inbounds(r,c,grid.length,grid[0].length)){
            return false;
         }

         if(visited.contains(pos)){
            return false;
         }

         if(grid[r][c] == '0'){
            return false;
         }

         visited.add(pos);

         explore(r -1, c, visited, grid);
         explore(r + 1, c, visited, grid);
         explore(r, c - 1, visited, grid);
         explore(r, c + 1, visited, grid);

         return true;

    }

    private boolean inbounds(int r, int c, int rows, int cols){
        return r < rows && r >= 0 && c < cols && c >= 0;
    }
}
