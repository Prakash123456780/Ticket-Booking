package com.example.Ticket._bookingRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Ticket._bookingEntity.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
