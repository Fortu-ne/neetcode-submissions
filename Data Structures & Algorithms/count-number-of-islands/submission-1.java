class Solution {
    public int numIslands(char[][] grid) {
     HashSet<String> vistied = new HashSet<>();
        int count = 0;

         if(grid == null) return count;

        for (int r = 0; r < grid.length ; r++) {
            for (int c = 0; c < grid[0].length ; c++) {
                if(explore(r,c,vistied,grid)){
                    count+=1;
                }
            }
        }


        return count;
    }

    private static boolean explore(int r, int c, HashSet<String> vistied, char[][] grid) {

        if(!inBounds(r,grid.length,c,grid[0].length)){
            return false;
        }

        String str = r + "," + c;


        if(vistied.contains(str)){
            return false;
        }

        if(grid[r][c] == '0'){
            return false;
        }

        vistied.add(str);

        explore(r - 1, c, vistied,grid);
        explore(r + 1, c, vistied,grid);
        explore(r , c -1, vistied,grid);
        explore(r , c + 1, vistied,grid);



        return true;
    }

      private static boolean inBounds(int r, int rows, int c, int cols) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }
}
