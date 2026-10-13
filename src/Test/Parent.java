package Test;

public class Parent extends Grandparent {

    public Parent(String name, int age) {
        super(age,name);
        System.out.println("parent constructor called");
    }

    public void parentMethod() {

        System.out.println("parent method called");
    }
}


