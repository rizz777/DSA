class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int end = nums.length;
        Boolean check = false;
        int mid = 0;
        for(int i=0; i<nums.length; i++){
             mid = (st + end)/2;
            if(target == nums[mid]){
                return(mid);
                
            }
            else if(target<nums[mid]){
                end = mid;
            }
            else if(target>nums[mid]){
                st = mid;
            }
            
        }
        if(check == false){
            return -1;
        
        }
     else return mid;

    }
}