import java.util.Arrays;

public class leetcode_4 {
    public static void perfect() {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        int n = nums1.length + nums2.length;
        int[] arrmain = new int[n];
        int a = 0;
        double e = 0.0;
        int f = 0;

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                for (int k = 0; k < arrmain.length; k++) {
                    if (nums1[i] < nums2[j]) {
                        arrmain[k++] = nums1[i];

                    }else {
                        arrmain[k++] = nums2[j++];
                    }
                }

            }
        }
        for (int i = 0; i < arrmain.length; i++) {
            System.out.print(arrmain[i] + " ");
        }

    }
    public static void mergArray() {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        int n = nums1.length + nums2.length;
        int[] arrmain = new int[n];

        int a = 0;
        double e = 0.0;
        int f = 0;
        for (int i = 0; i < nums1.length; i++) {
            arrmain[i] = nums1[i];
        }

        for (int j = 0; j < arrmain.length; j++) {
            if (arrmain[j] == 0) {
                for (int d = 0; d < nums2.length; d++) {
                    arrmain[j++] = nums2[d];
                }
            }
        }
        Arrays.stream(arrmain).sorted();


        for (int i = 0; i < arrmain.length; i++) {
            System.out.print(arrmain[i] + " ");
        }
        System.out.println();
        System.out.println("-----Merged Array is-----");

        a = arrmain.length / 2;


        for (int i = 0; i < arrmain.length; i++) {
            if (i == a) {
                if (arrmain.length % 2 == 0) {
                    e = (arrmain[i - 1] + arrmain[i]) / 2.0;
                    System.out.println(e);
                } else {
                    f = arrmain[i];
                    System.out.println(f);
                }
            }

        }


    }

    public static void myarra() {
        int[] nums1 = {1, 3, 5, 7};
        int[] nums2 = {2, 4, 6, 8};
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n = n1 + n2;
        int[] new_arr = new int[n];

        int i = 0, j = 0, k = 0;

        while (i <= n1 && j <= n2) {
            if (i == n1) {
                while (j < n2) {
                    new_arr[k++] = nums2[j++];
                }
                break;
            } else if (j == n2) {
                while (i < n1) {
                    new_arr[k++] = nums1[i++];
                }
                break;
            }

            if (nums1[i] < nums2[j]) {
                new_arr[k++] = nums1[i++];
            } else {
                new_arr[k++] = nums2[j++];
            }
        }
    }

    static void method2(){
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};

        int[] new_arr = new int[nums1.length+ nums2.length];
int index =0;
int index2 = 0;
int temp = 0;
double result = 0.0;
        for (int i = 0; i < nums1.length; i++) {
            new_arr[i] = nums1[i];
            index++;
        }
        for (int i = index; i < new_arr.length; i++) {
            new_arr[i] = nums2[index2];
            index2++;
        }

        for (int i = 0; i < new_arr.length; i++) {
            for (int j=i+1; j< new_arr.length; j++){
                if(new_arr[i] > new_arr[j]){
                    temp = new_arr[i];
                    new_arr[i] = new_arr[j];
                    new_arr[j] = temp;
                }
            }
        }

       if(new_arr.length % 2 == 0){
           result = (new_arr[new_arr.length / 2] + new_arr[(new_arr.length/2) - 1])/2.0;
       }else {
           result = new_arr[new_arr.length/2];
       }

        System.out.println(result);

    }


    public static void main(String[] args) {
//        mergArray();
//        myarra();
//        perfect();
        method2();
    }
}
