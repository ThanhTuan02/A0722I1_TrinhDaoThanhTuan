package s02_loop_array.baitap;

import java.util.Scanner;

public class Xoa_array {
    public static void main(String[] args) {
        int N, x;
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size array");
        N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            System.out.println("Enter number array " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 1; i <= N; i++) {
            System.out.println(array[i]);
        }
        System.out.println("Enter number need delete");
        x = sc.nextInt();
        for (int j = 0; j <= array.length; j++) {
            if (array[j] == x) {
                for (int i = j; i < array.length; i++) {
                    if (i == (array.length) - 1) {
                        array[i] = 0;
                    } else {
                        array[i] = array[i + 1];
                    }
                }
            }
        }


//        int N;
//        int x;
//        int[] array = new int[10];
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhập size của mảng");
//        N = sc.nextInt();
//        for (int i = 1; i <= N; i++) {
//            System.out.println("nhập số vào mảng " + i);
//            array[i] = sc.nextInt();
//        }
//        for (int i = 1; i <= N; i++) {
//            System.out.println(array[i]);
//        }
//        System.out.println("nhập số cần cần xóa");
//        x = sc.nextInt();
//        for (int j = 0; j < array.length; j++) {
//            if (array[j] == x) {
//                for (int i = j; i < array.length; i++) {
//                    if (i == (array.length) - 1) {
//                        array[i] = 0;
//                    } else {
//                        array[i] = array[i + 1];
//                    }
//                }
//                break;
//            }
//        }
//        System.out.println("kêt quả sau khi xóa mảng");
//        for (int i = 1; i <= N; i++) {
//            System.out.println(array[i]);
//        }
    }
}
