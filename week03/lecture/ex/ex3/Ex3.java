package OOT.week03.lecture.ex.ex3;

import java.util.Scanner;

public class Ex3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your budget: ");
        int budget = sc.nextInt();

        String tool = (budget >= 1 && budget <= 500) ? "Keyboard" : (budget > 500 && budget <= 1000) ? "Mouse" : (budget > 1000 && budget <= 2000) ? "Router" : (budget > 2000 && budget <= 10000) ? "Moniter" : (budget > 10000) ? "Graphic Card" : "ํYou can't buy";

        System.out.println(tool);
        sc.close();
    }
}
