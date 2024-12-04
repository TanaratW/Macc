package OOT.week03.lab.lab2;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num:");
        float number = sc.nextFloat();

        String status = (number > 0) ? "บวก ": (number == 0) ? "" : "ลบ ";
        String typenum = ((number%1) == 0) ? "จำนวนเต็ม " : "จำนวนจริง ";
        String oddeven = ((number%2) == 0) ? "เลขคู่ " : "เลขคี่ ";

        System.out.print(status + typenum + oddeven);
        sc.close();
    }
    
}
