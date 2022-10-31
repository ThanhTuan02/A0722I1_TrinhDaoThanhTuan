package s02_loop_array.baitap;

import java.util.Scanner;

public class find_min_array {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter your size: ");
            size = sc.nextInt();
            if (size>20)
                System.out.println("Size should not exceed 20");
        } while (size > 20);
        array = new int[size];
        int i =0;
        while (i < array.length) {
            System.out.println("Enter element"+ (i+1)+ ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.print("Property list: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        int min = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest property value in the list is " + min + " ,at position " + index);
    }
}
