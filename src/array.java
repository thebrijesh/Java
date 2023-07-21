public class array {

//    1234123

    public static void find(int[] arry) {
        int a = 0;

        for (int i = 0; i < arry.length; i++) {
            for (int j = i + 1; j < arry.length; j++) {
                if (arry[i] == arry[j]) {

                    arry[i] = -1;
                    arry[j] = -1;
                }
            }
            if (arry[i] != -1) {
                a++;
            }

        }
        System.out.println(a);

    }

    public static void spiral(int[][] arrray){
        int[][] array2d = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

    }

    public static void target(int[] arr) {
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 12) {
                        a++;

                    }
                }

            }

        }
        System.out.println(a);
    }

    public static boolean isshorted(int[] arr) {
        boolean a = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                a = false;
                break;
            }
        }
        return a;
    }

    public static void searcharray() {
        int[] a = {1, 5, 4, 12, 500, 464, 78, 857, 44, 1528, 6985, 7444, 1528, 7, 8557, 8, 78, 5, 7, 12, 7, 89};
        int x = 1528;
        for (int i = 0; i < a.length; i++) {

            if (x == a[i]) {
                System.out.println(i);
                break;
            }

        }

    }

    public static void main(String[] args) {
//        searcharray();
//        int[] array = {1, 2, 3, 4, 5, 6, 1};
        int[] array = {1, 2, 3,4, 2, 3,1};
//        System.out.println(isshorted(array));
//        target(array);
        find(array);
    }
}
