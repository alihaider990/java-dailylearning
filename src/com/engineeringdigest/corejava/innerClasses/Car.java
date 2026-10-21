package com.engineeringdigest.corejava.innerClasses;

public class Car {

    private String model;
    private boolean isEngineOn;

    public Car(String model) {
        this.model = model;
        this.isEngineOn = false;
    }   // constructor ends here

    // ---------- Inner class (at class level, NOT inside the constructor) ----------
    public class Engine {

        public void start() {
            if (!isEngineOn) {
                isEngineOn = true;
                System.out.println(model + " engine started.");
            } else {
                System.out.println(model + " engine is already running.");
            }
        }

        public void stop() {
            if (isEngineOn) {
                isEngineOn = false;
                System.out.println(model + " engine stopped.");
            } else {
                System.out.println(model + " engine is already off.");
            }
        }
    }

    // ---------- Getters / Setters ----------
    public String getModel() {
        return model;
    }

    public boolean isEngineOn() {
        return isEngineOn;
    }

    public void setEngineOn(boolean engineOn) {
        this.isEngineOn = engineOn;
    }
}