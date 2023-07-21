public class maxinarray {


    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        int b = 0;

        for (int j = 0; j < a.length; j++) {
            if (a[j] > b) {

                b = a[j];


            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b) {
                a[i] = -1;
            }
        }
        for (int k = 0; k < a.length; k++) {
            if (a[k] > 0) {

                b = a[k];


            }
        }
        System.out.println(b);

    }
}
