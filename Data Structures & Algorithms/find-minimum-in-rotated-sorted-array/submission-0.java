class Solution {
    public int findMin(int[] nums) { 
        List<Integer> list = new ArrayList<>();

        if(nums.length == 0) return 0;

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
        }

        Collections.sort(list);

        return list.get(0);

    }
}
