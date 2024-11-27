class NumArray {
    int[] ps;
    public NumArray(int[] nums) {
        ps = new int[nums.length];
        ps[0] = nums[0];
        for(int i=1;i<nums.length;i++){
            ps[i] = ps[i-1]+nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left==0){
            return ps[right];
        }
        return ps[right] - ps[left-1];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */