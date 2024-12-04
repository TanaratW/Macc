package OOT.week04.lecture.ex3;

import java.util.Scanner;

public class DoWhile {
    public static void main(String args[]){
        int num1, num2;
        String Q;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter num1 and num2: ");
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println("The summation is " + (num1+num2));
            System.out.print("Do you want to do it again? ");
            Q = sc.next();
        } while (Q.equalsIgnoreCase("Yes"));
        sc.close();
    }
    
}
