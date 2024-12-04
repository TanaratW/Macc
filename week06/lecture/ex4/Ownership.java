package OOT.week06.lecture.ex4;

public class Ownership {
    private Owner o1;
    private Car c1;
    
    public Ownership(Owner o1, Car c1){
        this.o1 = o1;
        this.c1 = c1;
    }

    //Override
    public String toString(){
        return o1.toString() + "\n" + c1.toString();
    }

    public Owner getO1(){
        return o1;
    }

    public void setO1(Owner o1){
        this.o1 = o1; 
    }

    public Car getC1(){
        return c1;
    }

    public void setC1(Car c1){
        this.c1 = c1; 
    }
}
