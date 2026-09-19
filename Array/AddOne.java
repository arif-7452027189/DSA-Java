

public class AddOne {
    public static int[] addOne(int[] nums) {
        for(int i = nums.length - 1; i >= 0; i--) {
            if(nums[i] < 9) {
                nums[i] ++;
                return nums;
            } else {
                nums[i] = 0;
            }
        }
        int[] result = new int[nums.length + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int answer[] = addOne(nums);
        for(int[] i : answer) {
            
        } 
    }
}
