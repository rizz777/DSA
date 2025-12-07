class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int a = 0;
        for(int i=0 ; i<n ; i++){
            if(nums[i] != 0){
                nums[a++] = nums[i];
            }
        }
        while(a < n){
            nums[a++] = 0;
        }
        
    }
}