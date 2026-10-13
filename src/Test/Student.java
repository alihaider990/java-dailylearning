package Test;

public class Student {

private int age;
private String name;
private int rollNumber;

public Student (String name, int rollNumber, int age){
    this.age = age;
    this.name = name;
    this.rollNumber= rollNumber;
}

public Student(String name){
    this.name = name;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0){
            System.out.println("invalid age");
        }else {
            this.age=age;
        }
        this.age = age;
    }


}
