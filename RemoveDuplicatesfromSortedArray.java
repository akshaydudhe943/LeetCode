class Solution {
    public int removeDuplicates(int[] nums) {
		short k = 1;
		for(short i = 1; i<nums.length ; i++) {
			if(nums[i] != nums[i-1]) {
				nums[k]=nums[i];
				k++;
			}
		}
		for(short p=k ; p<nums.length ; p++)
		{
			nums[p]=0;
		}
		return k;
	}
}