package OOT.week03.lecture.ex.ex1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();

        if (budget > 15000)
            System.out.println("You can buy it !!!");
        else
            System.out.println("You can't buy !!!");
        
        sc.close();
    }

    
}
