class Solution {
    public int singleNumber(int[] nums) {
        int f=0;
        for(int i=0;i<nums.length;i++){
            f=0;
            for(int j=0;j<nums.length;j++)
                if(nums[i]==nums[j] && i!=j)
                    f=1;
            if(f==0)
                return nums[i];
        }
        return -1;
    }
}