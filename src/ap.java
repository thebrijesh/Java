public class ap {

    public static void ap1(int n) {
        int a = 0;
        for (int i = 10; i < n; i++) {

            if (i % 5 == 2) {
                System.out.print(i + " ");
                a = a + i;

            }
        }
        System.out.println(" = " + a);
    }

    public static void ap2(int n) {
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 100; i < n; i++) {

            if (i % 13 == 0) {
                c = i;
                break;


            }

            if (i % 13 == 0) {
                System.out.print(i + " ");
                b = i;
                a = a + i;

            }
        }
        System.out.println(" = " + a);

        for (int i = 0; i < b; i++) {

        }
//        for (int i = 0; i <; i++) {
//
//        }
    }


    public static void main(String[] args) {
        ap1(100);
        ap2(400);

    }
}
