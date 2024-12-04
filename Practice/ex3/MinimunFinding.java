package OOT.Practice.ex3;

import java.util.Scanner;

public class MinimunFinding {
public static void main(String[] args) {
    MinimunFinding mn = new MinimunFinding();
    int num = mn.min(5, 2);
    System.out.println(num);
    }

    public int min(int num1, int num2) {
    int minValue = (num1 < num2 ? num1 : num2);
    return minValue;
    }
}
