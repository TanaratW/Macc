package OOT.Practice.ex4;

import java.util.Scanner;

public class Triangle{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number: ");
        int rows = sc.nextInt();
        sc.close();

        for (int i = 1; i <= rows; i++) { 
  
            // loop to print the number of spaces before the star 
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            // loop to print the number of stars in each row 
            for (int j = 1; j <= i; j++) { 
                System.out.print("0 "); 
            } 
  
            // for new line after printing each row 
            System.out.println(); 
        }
    }
}