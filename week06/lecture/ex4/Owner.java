package OOT.week06.lecture.ex4;

public class Owner {
    private String name, gender;
    private int age;

    public Owner(String name,String gender,int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    //Override
    public String toString(){
        return name + "\t" + gender + "\t" + age;
    }

    public String getName(){
        return name;
    }

    public String getGender(){
        return gender;
    }

    public int getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public void setAge(int age){
        this.age = age;
    }
}
