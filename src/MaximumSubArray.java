public class MaximumSubArray {
    public int maxSubarray(int[]nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            max = Math.max(sum, max);
            if (sum < 0) {
                sum = 0;
            }

        }
        return max;
    }
    public static void main(String[] args){
        MaximumSubArray obj = new MaximumSubArray();
        int [] nums ={ 2,5,2,-4,2 ,5,4};
        System.out.println(obj.maxSubarray(nums));
    }
}
