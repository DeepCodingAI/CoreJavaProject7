package exception;

import java.util.Scanner;

public class HandleRunTimeException {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter two numbers, one to division and another number to divider");
        int numberToBeDivided = sc.nextInt();
        int dividerNumber = sc.nextInt();
        int total = 0;
        try {
           total = numberToBeDivided / dividerNumber;
        }catch(Exception ex){
            System.out.println("Please don't try to divide a number by Zero.");
            System.out.println(" We did some mistake, but we will ba careful from now on");

        }
        System.out.println(total);
        System.out.println("We will be able to handle exception smoothly if anything occur");

    }
}
