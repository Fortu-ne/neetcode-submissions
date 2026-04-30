class Solution {
    public boolean hasDuplicate(int[] nums) { //say we gonna receive nums = 12223445
        for (int i = 0; i < nums.length; i++){ //this will list them as they are in the list
            for (int j = i + 1; j < nums.length; j++){//I like to call this tagging
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}