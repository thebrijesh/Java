public class leetcode26 {
//    Input: nums = [0,0,1,1,1,2,2,3,3,4]
//    Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2,2, 3, 3, 4};
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == nums[i]) {

                    k = i;


                }
            }

        }
        System.out.println(k);
    }
}
