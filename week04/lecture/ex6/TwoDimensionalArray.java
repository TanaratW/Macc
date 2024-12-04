package OOT.week04.lecture.ex6;



public class TwoDimensionalArray {
    public static void main(String args[]){
        int [][] arr2d = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
        int sum;
        for(int i = 0; i< arr2d.length; i++){
            sum  = 0;
            for(int j = 0; j< arr2d[i].length; j++){
                sum += arr2d[i][j];
            }
            System.out.println("Summation of row " + i + " is " + sum);
        }
    }
    
}
