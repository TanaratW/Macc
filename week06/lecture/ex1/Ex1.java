package OOT.week06.lecture.ex1;

import java.util.Random;
//import java.text.DecimalFormat;

public class Ex1 {
    public static void main(String args[]){
        Random rand = new Random();
        // DecimalFormat fmt = new DecimalFormat("#.###");
        // System.out.println(fmt.format(1.5158));
        int num1;
    
        num1 = rand.nextInt(2) + 1;
        System.out.println("A random integer (from 1 to 2): " + num1);
        num1 = rand.nextInt(100) + 1;
        System.out.println("A random integer (from 1 to 100): " + num1);
        num1 = rand.nextInt(10);
        System.out.println("A random integer (from 0 to 9): " + num1);
        num1 = rand.nextInt(113) + 1000;
        System.out.println("A random integer (from 1000 to 1112): " + num1);
        num1 = rand.nextInt(3) - 1;
        System.out.println("A random integer (from -1 to 1): " + num1);
        num1 = rand.nextInt(15) - 3;
        System.out.println("A random integer (from -3 to 11): " + num1);
    }
    
}
