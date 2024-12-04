package OOT.week03.lecture;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        final int MINOR = 21;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Your age: " + age);

        if(age < MINOR)
            System.out.println("Youth is a wonderful thing. Enjoy your life!");

        System.out.println("Age is a state of mind.");
        sc.close();
    }
}

