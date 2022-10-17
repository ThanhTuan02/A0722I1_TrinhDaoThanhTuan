package s02_loop.baitap;

import java.util.Scanner;

public class cac_loai_hinh {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Menu");
            System.out.println("1.Print the rectangle");
            System.out.println("2.Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right");
            System.out.println("3.Print isosceles triangle");
            System.out.println("4.Exit");

            int Print = scanner.nextInt();
            switch (Print) {
                case 1:
                    int i;
                    for (i = 1; i <= 3; i++) {
                        System.out.println("");

                        for (int j = 1; j <= 5; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 2:
                    for (i = 1; i <= 5; i++) {
                        System.out.println("");
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                    }
                    break;
                case 3:
                    for (i=0;i<4;i++) {
                        for (int j=1;j<6;j++) {
                            if (i==0 && j==3 || i==1 && (j==2 && j==3 && j==4) ||i==2 && i==2 && (j<5 && j>1) || i==3) {
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}

