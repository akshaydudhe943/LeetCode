class Solution {
    public int searchInsert(int[] nums, int target) {
        short i=0;
        for(  ;i<nums.length && nums[i]<=target ; i++){
            if(nums[i]==target){
                return i;
            }
        }
        return i;
    }
}