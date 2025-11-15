package com.example.sec03.code.challenge;

public class CodeChallenge3 {

    public static void main(String[] args) {
        Ticket ticket = new AdultTicket(28.0);
        System.out.println(getDetails(ticket));

        Ticket ticket1 = new ChildTicket(10.0);
        System.out.println(getDetails(ticket1));
    }

    public static String getDetails(Ticket ticket) {
        if (ticket instanceof AdultTicket(double price)) {
            return STR."Adult ticket has price \{price}";
        } else if (ticket instanceof ChildTicket(double price)) {
            return STR."Child ticket has price \{price}";
        } else {
            return "Unknown ticket type";
        }
    }
}
