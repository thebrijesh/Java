import java.util.Scanner;

public class sumnumbers {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

        int getNum = scanner.nextInt();
        int a;
        int num = 0;

        for (int i = 0; i <= getNum; i++) {

            if (getNum >0) {
                getNum = getNum/10;
                num++;
            }


        }
        System.out.println(num);

    }
}

//import java.util.Scanner;
//
//public class sumnumbers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int getNum = scanner.nextInt();
//        int a;
//        int num = 0;
//
//        while (getNum > 0) {
//            getNum = getNum / 10;
//            num++;
//
//        }
//
//
//        System.out.println(num);
//
//    }
//}
