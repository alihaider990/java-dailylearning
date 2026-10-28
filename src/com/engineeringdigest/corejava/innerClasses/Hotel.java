package com.engineeringdigest.corejava.innerClasses;

public class Hotel {
    private  String name;

    private int totalRooms;
    private int reservedRooms;

    public Hotel(String name, int totalRooms, int reservedRooms) {
        this.name = name;
        this.totalRooms = totalRooms;
        this.reservedRooms = reservedRooms;
    }
    public void reserveRoom(String guestName, int numOfRooms){
        class ReservationValidator{
            boolean validate() {
                if (guestName == null || guestName.isBlank()) {
                    System.out.println("guest name cannot be empty! ");
                    return false;
                }
                if(numOfRooms < 0){
                    System.out.println("numbers of rooms should be positive");
                    return false;
                }
                if(reservedRooms + numOfRooms > totalRooms){
                    System.out.println("not enough rooms availible");
                    return false;
                }
                return true;
            }
        }

        ReservationValidator validator = new ReservationValidator();
        if(validator.validate()){
            reservedRooms += numOfRooms;
            System.out.println("reservation confirmed for " + guestName + numOfRooms + " rooms. ");
        }else{
            System.out.println("reservation failed");
        }
    }


}
