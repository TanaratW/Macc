package OOT.week03.lecture.ex.ex2;

import java.util.Random;
import java.util.Scanner;

public class Ex2 {
    public static void main(String args[]){
        final int MAX = 10;
        int answer, guess;

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        answer = rand.nextInt(MAX) + 1;

        System.out.print("I'm thinking of a number betwwn 1 and" + MAX + ". Guess what is it: ");

        guess = sc.nextInt();

        if(guess == answer){
            System.out.println("Gotcha! Good guessing.");
        } else {
            System.out.println("Sorry, wrong guess.");
            System.out.println("The number was " + answer);
        }

        sc.close();
    }
    
}
