package OOT.week06.lecture.ex4;

public class Car {
    private String brand, colour;
    private int licenseID;

    public Car(int licenseID, String brand, String colour){
        this.licenseID = licenseID;
        this.brand = brand;
        this.colour = colour;
    }

    //Override
    public String toString(){
        return licenseID + "\t" + brand + "\t" + colour;
    }

    public String getBrand(){
        return brand;
    }

    public String getColour(){
        return colour;
    }

    public int getLicenseID(){
        return licenseID;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setColour(String colour){
        this.colour = colour;
    }

    public void setLicenseID(int licenseID){
        this.licenseID = licenseID;
    }
    
}
