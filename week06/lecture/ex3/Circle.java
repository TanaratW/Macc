package OOT.week06.lecture.ex3;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public static void main(String args[]){
        Circle c1 = new Circle();
        Circle c2 = new Circle();
        System.out.println("Circle 1: area = " + c1.getArea() + ", radius = " + c1.getRadius());
        System.out.println("Circle 2: area = " + c2.getArea() + ", radius = " + c2.getRadius());
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return radius;
    }
    
}
