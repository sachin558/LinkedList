public class Array {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
       twoSum(nums,target);
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]+nums[j+1]==target){
                    return new  int[] {i,j};
                }
            }
            return new int []{-1,-1};
        }
        return nums;
    }

}
