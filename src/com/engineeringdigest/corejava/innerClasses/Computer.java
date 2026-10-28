package com.engineeringdigest.corejava.innerClasses;

public class Computer {

    private String brand;
    private String model;
    private OperatingSystem os;

    static  class USB{
        private String type;

        public USB(String type) {
            this.type = type;
        }

        void displayInfo(){
            System.out.println("");
        }
    }

    public Computer(String brand, String model, String osName) {
        this.brand = brand;
        this.model = model;
        this.os = new OperatingSystem(osName);   // plain new works inside the outer class
    }

    public OperatingSystem getOs() {              // was missing
        return os;
    }

    public class OperatingSystem {
        private String osName;

        public OperatingSystem(String osName) {
            this.osName = osName;
        }

        public String getOsName() {
            return osName;
        }

        public void displayInfo() {
            System.out.println("Computer : "+ model + ", OS: " + osName);
        }
    }
}