class Solution {
    public int coinChange(int[] coins, int amount) {
        
        return numWays(0, coins,amount);
    }

      private int numWays(int i, int[] coins, int x) {
        // Base case 1: Successfully made exact amount
        if (x == 0) return 0;  // Need 0 more coins
        
        // Base case 2: No more coins left, but still need money
        if (i == coins.length) return -1;  // Impossible
        
        // Base case 3: Negative amount (overshot)
        if (x < 0) return -1;  // Impossible
        
        int take = -1;  // Initialize as impossible
        int skip = -1;  // Initialize as impossible
        
        // Option 1: Take current coin (if it fits)
        if (x >= coins[i]) {
            int result = numWays(i, coins, x - coins[i]);  // Stay at same coin
            if (result != -1) {
                take = result + 1;  // Add 1 for the coin we just used
            }
        }
        
        // Option 2: Skip current coin (move to next)
        skip = numWays(i + 1, coins, x);  // Move to next coin
        
        // Combine results: return minimum valid option
        if (take == -1 && skip == -1) return -1;  // Both impossible
        if (take == -1) return skip;              // Only skip works
        if (skip == -1) return take;              // Only take works
        return Math.min(take, skip);   
}

}
