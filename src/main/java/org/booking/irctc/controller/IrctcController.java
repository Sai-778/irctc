package org.booking.irctc.controller;

import org.booking.irctc.model.CheckNumber;
import org.booking.irctc.model.Ticket;
import org.booking.irctc.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/irctc")
public class IrctcController {

@Autowired
TicketService ticketService;

    @PostMapping("/pay")
    public ResponseEntity bookTicket(@RequestBody Ticket ticket){
        System.out.println(ticket);
        ResponseEntity response = ticketService.bookticket(ticket);
        return new ResponseEntity(response, HttpStatus.OK);
    }

    @PostMapping("/check")
    public String ticketStatus(@RequestBody CheckNumber number){
        //service call
       return ticketService.ticketBookedStatus(number);

    }



}
