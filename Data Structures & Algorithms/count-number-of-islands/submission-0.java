class Solution {
    public int numIslands(char[][] grid) {

        HashSet<String> visited = new HashSet<>();
        int count = 0;

        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if(explore(grid, r, c, visited))
                {
                   count+=1;
                }
            }

        }

        return count; 
    }


    private static boolean explore(char[][] grid, int r, int c, HashSet<String> visited) {

        
        if(!inBounds(r,c, grid.length, grid[0].length)) return false;

        String str = r + ","+ c ;
        if(visited.contains(str)) return false;

        if(grid[r][c] == '0') return false;

        visited.add(str);


        explore(grid,r-1,c, visited);
        explore(grid,r+1,c, visited);
        explore(grid,r,c-1, visited);
        explore(grid,r,c+1, visited);

        return true;

    }

    private static boolean inBounds(int r, int c, int rows, int cols) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }


}
