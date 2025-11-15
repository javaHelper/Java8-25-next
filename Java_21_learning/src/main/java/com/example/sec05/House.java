package com.example.sec05;

public record House(String address, int numberOfBedRooms, boolean hasBasement) implements Building {
}
