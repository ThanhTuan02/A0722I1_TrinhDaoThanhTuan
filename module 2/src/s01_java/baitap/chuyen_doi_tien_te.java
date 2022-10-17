package s01_java.baitap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double vnd = 23000, usd;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your money");
        usd =sc.nextDouble();
        double change = usd * vnd;
        System.out.println("Giá trị VND: " + change);
    }
}



//  double vnd = 23000;
//        double usd;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Mời bạn nhập số tiền USD");
//        usd = sc.nextDouble();
//        double quydoi = usd * 23000;
//        System.out.println("Giá trị VND: " + quydoi);