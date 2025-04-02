package com.example.Ticket._bookingController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Ticket._bookingService.TicketService;

@RestController
@RequestMapping("/tickets")
public class TicketController {
    @Autowired
    private TicketService service;

    @PostMapping("/book")
    public ResponseEntity<String> bookTicket(@RequestParam String user, @RequestParam int seats) {
        return ResponseEntity.ok(service.bookTicket(user, seats));
    }

    @GetMapping("/available")
    public ResponseEntity<Integer> getAvailableSeats() {
        return ResponseEntity.ok(service.getAvailableSeats());
    }
}
