class Solution {
    public int[] twoSum(int[] numbers, int target) {

      if(numbers.length < 1) return new int[]{};

      Arrays.sort(numbers);

      int l = 0;
      int r = numbers.length - 1;
      int res =0;

      while(l < r){

         res = numbers[l] + numbers[r];

            if(res == target ){
                return new int[]{l+1,r+1};
            }
            else if (res < target){
                l++;
            }
            else {
                r--;
            }
      }

       return new int[]{};

    }
}
