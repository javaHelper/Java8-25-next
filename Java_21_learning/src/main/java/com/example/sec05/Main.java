package com.example.sec05;

public class Main {

    public static void main(String[] args) {
        House house = new House("123 Main St", 3, true);
        printNumberOfBedRooms(house);
        printNumberOfBedRoomsRefactor(house);
    }

    private static void printNumberOfBedRooms(Building building) {
        if (building instanceof House(var address, var numberOfBedRooms, var hasBasement)) {
            System.out.println(STR."Number of Bed Rooms: \{numberOfBedRooms}");
        }
    }

    private static void printNumberOfBedRoomsRefactor(Building building) {
        if (building instanceof House(_, var numberOfBedRooms, _)) {
            System.out.println(STR."Number of Bed Rooms: \{numberOfBedRooms}");
        }
    }

}
