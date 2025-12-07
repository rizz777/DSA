class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> Set1 = new HashSet<>();
        Set<Integer> Result = new HashSet<>();
        int n = nums1.length;
        int m = nums2.length;
        for(int num : nums1 ){
            Set1.add(num);
        }
        for (int num : nums2){
            if(Set1.contains(num)){
                Result.add(num);
            }
        }
        int[] ans = new int[Result.size()];
        int a = 0;
        for(int num : Result){
            ans[a++] = num;
        }
        return ans;
    }
}