package Test.accessmodifiers.test.test;

import Test.accessmodifiers.test.test.Zoo.Dog;

public class test {
    public static void main(String[] args){
        Dog dog = new Dog("bob");
        dog.makeSound();
        dog.setDogSound("woof");
        dog.makeSound();
        dog.wagTail();

    }
}
