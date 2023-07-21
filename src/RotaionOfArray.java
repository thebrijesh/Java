import java.util.Scanner;

public class RotaionOfArray {
    public static int[] Rotaion(int[] arr, int k) {

        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void evenOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp = 0;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void pointer(int[] arr) {
        int i = 1;
//        int j = arr.length - 1;
        int temp = 0;
//        int a = arr[i] * arr[i];
//        int b = arr[j] * arr[j];

        for (int k = 0; k < arr.length; k++) {
            arr[k] = arr[k] * arr[k];
        }


        for (int k = arr.length - 1; k >= 0; k--) {
            System.out.println(arr[k]);
        }
    }

    public static void prefix(int[] arr, int k) {
        int sum = 0;
        System.out.println(arr[0]);
        for (int i = 1; i < k; i++) {
            for (int j = i - 1; j < k; j++) {

                arr[i] = arr[i] + arr[j];
                sum = arr[i];

                System.out.println(sum);
                break;
            }

        }

    }

    public static void itself(int[]n){
        int count = 0;
        for (int i = 0; i < n.length; i++) {
            System.out.print(n[i]+" ");
            count++;
        }
        System.out.println(count );
        for (int j = 0; j < n.length; j++) {
            if (n[j]>count){
                System.out.print(n[j]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = scanner.nextInt();
        int[] arry = new int[n];

        for (int i = 0; i < n; i++) {
            arry[i] = scanner.nextInt();
        }

//        System.out.println("How many prefix");
//        int k = scanner.nextInt();
//        evenOdd(arry);
//        pointer(arry);
//        prefix(arry, k);
itself(arry);

    }
}
