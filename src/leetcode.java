import java.util.ArrayList;
import java.util.List;

public class leetcode {

    public static void leetcode66(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1;
                break;
            } else {
                digits[i] = 0;
            }
        }


        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i]);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int l = m + n - 1;

        for (j = n - 1; j >= 0; j--) {

            if (i >= 0 && nums1[i] > nums2[j]) {
                j++;
                nums1[l--] = nums1[i--];

            } else {

                nums1[l--] = nums2[j];

            }
        }
        for (int k = 0; k < nums1.length; k++) {
            System.out.println(nums1[k]);
        }

    }

    public static void leetcode88(int[] nums1, int[] nums2) {
        int j = 0, k = 0;
//        int [] nums1  = {1,2,3,0,0,0}; int[] nums2 = {2,5,6};
        for (int i = 0; i < nums1.length; i++) {

        }

        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }

    public static void missingNumber(int[] nums) {
//        int n = nums.length;
//        int totalSum = n*(n+1)/2;
//        for(int i=0;i<n;i++){
//            totalSum -= nums[i];
//        }
//        return totalSum;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else if (count > 0) {
                int t = nums[i];
                nums[i] = 0;
                nums[i - count] = t;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int idx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                idx = nums[i] * -1 - 1;
            } else {
                idx = nums[i] - 1;
            }

            if (nums[idx] > 0) {
                nums[idx] = -nums[idx];
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                list.add(i + 1);
            }
            ;

        }

        return list;
    }

    public static int islandPerimeter(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += 4;
                    if (i > 0 && grid[i - 1][j] == 1) {
                        perimeter -= 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        perimeter -= 2;
                    }
                }
            }
        }
        return perimeter;
    }

    public static int maxProfit(int[] prices) {
        int aaaa = Integer.MAX_VALUE;
        int bbbb = 0;
        int cccc = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < aaaa) {
                aaaa = prices[i];
            }
            cccc = prices[i] - aaaa;
            if (bbbb < cccc) {
                bbbb = cccc;
            }
        }
        return bbbb;
    }

    public static int maxProfit1(int[] prices) {

        int max = 0, min = prices[0];
        for (int i = 1; i < prices.length; i++) {

            if (min < prices[i])
                max = Math.max(prices[i] - min, max);
            else
                min = prices[i];
        }
        return max;
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        int count = 0;
        for (int num : nums1) {
            if (temp[num] != 1) {
                temp[num] = 1;
            }
        }
        for (int num : nums2) {
            if (temp[num] == 1) {
                temp[num] = 2;
                count++;
            }
        }

          int[] res = new int[count];
        int index = 0;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 2) {
                res[index++] = i;
            }
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        intersection(nums1,nums2);













































        //        int[] arr = {7, 4, 9, 9, 9};
////        leetcode66(arr);
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {0,6,0,2,0,5,0,0,1};
//        int[] nums = {3,2,1,2,3,4,5,6};
//        int[] nums3 = {0,1,0,3,12};
//        int[][] myarr =
//                {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
////        leetcode88(nums1,nums2);
//        merge(nums1, 3, nums2, 3);
//        missingNumber(nums2);
//        moveZeroes(nums3);
//        findDisappearedNumbers(nums);
//        islandPerimeter(myarr);
//        maxProfit1(nums);
    }
}
