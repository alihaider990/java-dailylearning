package com.engineeringdigest.corejava.innerClasses;

import java.lang.classfile.attribute.ExceptionsAttribute;
import java.net.CacheRequest;

public class Test {
    public static void main(String[] args){
  Car car = new Car("mercedes");
  Car.Engine engine = car.new Engine();

       engine.start();
       engine.stop();

    }
}
