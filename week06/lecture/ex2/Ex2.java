package OOT.week06.lecture.ex2;

public class Ex2 {
    public static void main(String args[]){
        double x;
        x = Math.floor(7.5);
        System.out.println("Floor: " + x);
        x = Math.abs(0.0);
        System.out.println("Abs: " + x);
        x = Math.ceil(0.0);
        System.out.println("Ceil: " + x);
        x = Math.abs(-6.4);
        System.out.println("Abs (Negative): " + x);
        x = Math.ceil(-6.4);
        System.out.println("Ceil (Negative): " + x);
        x = Math.ceil(-Math.abs(-8 + Math.floor(-5.5)));
        System.out.println("Overall: " + x);
    }
    
}
