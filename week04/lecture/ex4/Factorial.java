package OOT.week04.lecture.ex4;

import java.util.Scanner;

public class Factorial {
    public static void main(String args[]){
        int n, sum = 1;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        System.out.print( n +"! = ");
        for(int i = n; i>= 1; i--){
            sum = sum * i;
            if (i == 1){
                System.out.println(i + " = " + sum);
            } else {
                System.out.print(i + " x ");
            }
        }
        System.out.print("Factorial value of " + n + " is " + sum );
        sc.close();
    }
    
}
