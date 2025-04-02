package com.example.Ticket._booking;

public class TicketBookingSimulation {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem(10); // 10 seats available

        // Creating multiple threads (users trying to book tickets)
        Thread user1 = new Thread(() -> system.bookTicket("User1", 3));
        Thread user2 = new Thread(() -> system.bookTicket("User2", 5));
        Thread user3 = new Thread(() -> system.bookTicket("User3", 4));

        user1.start();
        user2.start();
        user3.start();
    }
}

