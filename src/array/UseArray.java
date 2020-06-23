package array;

import java.util.Scanner;

public class UseArray {
    public static void main(String[] args) {

        int [] array = new int[6];
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter some numbers: ");

        for(int j=0; j<array.length; j++) {
            array[j] = sc.nextInt();
        }

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
