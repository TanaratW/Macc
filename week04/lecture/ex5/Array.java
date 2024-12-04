package OOT.week04.lecture.ex5;

import java.util.Arrays;

public class Array {
    public static void main(String args[]){
        int [] arrays = new int[]{12,17,14,15,16,89,23,1,9,100};
        int size = arrays.length;
        System.out.println(Arrays.toString(arrays));
        // for(int array : arrays){
        //     System.out.print(array + " ");
        // }
        //System.out.println();
        Arrays.sort(arrays);
        // for(int array : arrays){
        //     System.out.print(array + " ");
        // }
        System.out.println(Arrays.toString(arrays));
        //System.out.println();
        System.out.println("The second largest number is " + arrays[size-2]);
    }
    
}
