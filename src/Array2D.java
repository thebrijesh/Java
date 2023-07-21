import java.util.Scanner;

public class Array2D {

    static void printArry(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }


        }
    }

    static void multiply2Matrix(int[][] array1, int[][] array2, int arry1raw, int arry1col, int arry2raw, int arry2col) {
        int[][] multi = new int[arry1raw][arry2col];
        for (int i = 0; i < arry1raw; i++) {
            for (int j = 0; j < arry2col; j++) {
                for (int k = 0; k < arry1col; k++) {
                    multi[i][j] = multi[i][j] + array1[i][k] * array2[k][j];

                }
            }
        }
        printArry(multi);
    }

    static void arryRotate90degree() {
        int[][] myarr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < myarr.length; i++) {
            for (int j = myarr[i].length - 1; j >= 0; j--) {

                System.out.print(myarr[j][i]);

            }

            System.out.println();
        }
    }

    public static void newmathods() {
        int[] nums = {1, 3, 5, 6,8,10,12,14,16,20};
        int start = 0;
        int target = 18;
        int end = nums.length - 1;

        while (start <= end) {
            int mid =  (end + start) / 2;
            if (nums[mid] == target) {
                System.out.println(mid);
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

    }

    static void inputUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" --------Matrix 1-------- ");
        System.out.println("Enter Number of Raw ");
        int array1raw = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int array1col = sc.nextInt();

        int[][] array1 = new int[array1raw][array1col];
        System.out.println("Enter " + array1raw * array1col + " Elements");
        for (int i = 0; i < array1raw; i++) {
            for (int j = 0; j < array1col; j++) {
                array1[i][j] = sc.nextInt();
            }
        }
        System.out.println(" --------Matrix 2-------- ");
        System.out.println("Enter Number of Raw ");
        int array2raw = sc.nextInt();
        System.out.println("Enter Number of Columns");
        int array2col = sc.nextInt();

        int[][] array2 = new int[array2raw][array2col];
        System.out.println("Enter " + array2raw * array2col + " Elements");
        for (int i = 0; i < array2raw; i++) {
            for (int j = 0; j < array2col; j++) {
                array2[i][j] = sc.nextInt();
            }
        }
        System.out.println("------Your Output Is :------ ");
//        printArry(array);
        multiply2Matrix(array1, array2, array1raw, array1col, array2raw, array2col);

        System.out.println("---------------------------- ");
    }

    static void changeRawtoColumn() {
        int[][] myarr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] myarr2 = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};

        for (int i = 0; i < myarr.length; i++) {
            for (int j = 0; j < myarr[i].length; j++) {

                System.out.print(myarr[j][i] + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
//        inputUser();
//       changeRawtoColumn();
//        arryRotate90degree();
        newmathods();
    }
}
