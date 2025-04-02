package com.example.Ticket._booking;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBookingSystem {
    private int availableSeats;
    private final Lock lock = new ReentrantLock(); // Thread safety

    public TicketBookingSystem(int seats) {
        this.availableSeats = seats;
    }

    public boolean bookTicket(String user, int seats) {
        lock.lock(); // Ensures only one thread accesses this block at a time
        try {
            if (seats <= availableSeats) {
                System.out.println(user + " booked " + seats + " seats.");
                availableSeats -= seats;
                return true;
            } else {
                System.out.println(user + " failed to book seats. Not enough available.");
                return false;
            }
        } finally {
            lock.unlock(); // Release the lock
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

