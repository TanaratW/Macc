package OOT.week04.lecture.ex1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Average {
    public static void main(String args[]){
        int sum = 0, value, count = 0;
        double average;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (0 to quit): ");
        value = sc.nextInt();
        while (value != 0) {
            count++;
            sum += value;
            System.out.println("The summation is " + sum + " so far");
            System.out.print("Enter an integer (0 to quit): ");
            value = sc.nextInt();
        }
        System.out.println();
        if (count == 0) {
            System.out.println("No values were entered!");
        } else {
            average = (double)sum / count;
            DecimalFormat fmt = new DecimalFormat("0.###");
            System.out.println("The average is " + fmt.format(average));
        }
        sc.close();
            
    }
    
}
