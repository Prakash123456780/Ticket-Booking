package com.example.Ticket._bookingService;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock; // ✅ Add this import

import com.example.Ticket._bookingEntity.Ticket;
import com.example.Ticket._bookingRepository.TicketRepository;

@Service
public class TicketService {
    private int availableSeats = 10;
    private final Lock lock = new ReentrantLock(); // ✅ Now it works!

    @Autowired
    private TicketRepository repository;

    public String bookTicket(String user, int seats) {
        lock.lock(); // 🔒 Acquire lock
        try {
            if (seats <= availableSeats) {
                availableSeats -= seats;
                Ticket ticket = new Ticket();
                ticket.setUser(user);
                ticket.setSeats(seats);
                repository.save(ticket);
                return "Success: " + user + " booked " + seats + " seats.";
            } else {
                return "Failed: Not enough seats available.";
            }
        } finally {
            lock.unlock(); // 🔓 Release lock
        }
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}
