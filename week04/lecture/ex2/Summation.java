package OOT.week04.lecture.ex2;

import java.util.Scanner;

public class Summation {
    public static void main(String args[]){
        int count = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        num = sc.nextInt();

        while (num >= 0) {
            count += num;
            System.out.print("Input number: ");
            num = sc.nextInt();
        }
        System.out.println("The summation is " + count);
        sc.close();
    }
}
