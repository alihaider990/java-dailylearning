package Test;

public class Grandparent {





    private String name ;
    private int age;

    private boolean hasSuperPowers;

    public boolean HasSuperPowers() {
        return hasSuperPowers;
    }

    public void setHasSuperPowers(boolean hasSuperPowers) {
        this.hasSuperPowers = hasSuperPowers;
    }

    public Grandparent(int age, String name){
        this.age=age;
        this.name=name;
        hasSuperPowers = false;
        System.out.println("grandparent constructor called");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
