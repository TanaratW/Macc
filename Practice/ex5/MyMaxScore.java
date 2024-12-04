package OOT.Practice.ex5;

import java.util.Scanner;

public class MyMaxScore{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of subjects:");
        int nsub = sc.nextInt();
        sc.nextLine();
        String [] subjectArray = new String[nsub];
        float [] scoreArray = new float[nsub];
        
        if (nsub == 0){
            System.out.print("Your are not enrolled in any courses.");
        } else {
            for(int i = 0; i<nsub; i++){
                System.out.print("Input subject: ");
                InputSubject(subjectArray, i, sc);
            }
            
            for(int i = 0; i<nsub; i++){
                System.out.print("Input score: ");
                InputScore(scoreArray, i, sc);
            }
            
            System.out.println("You earn max score:");
            int count = 0;
            float max = scoreArray[count];
            findMax(scoreArray, max, nsub, count);
            System.out.printf("%s: %.1f", subjectArray[count],scoreArray[count]);
            
        }
        sc.close();
    }
    
    public static String[] InputSubject(String subjectArray[], int i,Scanner sc){
        subjectArray[i] = sc.nextLine();
        return subjectArray;
    }
    
    public static float[] InputScore(float scoreArray[],int i,Scanner sc){
        scoreArray[i] = sc.nextInt();
        return scoreArray;
    }
    
    public static int findMax(float scoreArray[],float max,int nsub,int count){
        for(int i = 1; i<nsub; i++){
            if(max < scoreArray[i]){
                max = scoreArray[i];
                count = i;
            }
        }
        return count;
    }
}