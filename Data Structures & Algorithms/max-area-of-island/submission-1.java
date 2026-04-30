class Solution {
    public int maxAreaOfIsland(int[][] grid) {
         HashSet<String> visited = new HashSet<>();
        int size = 0;
        int maxSize = Integer.MIN_VALUE;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
               size = explore(grid,r,c,visited);

               if(size > maxSize) maxSize = size;
            }
        }

        return maxSize;
    }

    private static int explore(int[][] grid, int r, int c, HashSet<String> visited) {

        if(!inBounds(r,c,grid.length,grid[0].length)) return 0;
        int size =0;

        if(grid[r][c] == 0) return 0;

        if(grid[r][c] == 1) size++;

        String str = r + "," + c ;
        if(visited.contains(str)) return 0;

        visited.add(str);

        size+= explore(grid,r -1,c,visited);
        size+= explore(grid,r +1,c,visited);
        size+= explore(grid,r ,c -1,visited);
        size+= explore(grid,r ,c + 1,visited);

        return size;
    }

    private static boolean inBounds(int r, int c, int rows, int cols) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }


}
