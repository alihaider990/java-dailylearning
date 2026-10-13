package Test;

public class Child extends Parent {

    public Child(int age, String name) {
     super(name, age);
        System.out.println("child constructor called");


    }
    public void childMethod(){

        System.out.println("child method called");
        super.parentMethod();
    }
}









