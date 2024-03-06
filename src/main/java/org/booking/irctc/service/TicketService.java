package org.booking.irctc.service;

import org.booking.irctc.model.CheckNumber;
import org.booking.irctc.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

@org.springframework.stereotype.Service
public class TicketService {
 //   Ticket ticket;

public ResponseEntity bookticket(Ticket ticket){
    if(ticket!=null){
        if(ticket.getAmount()!=null&&ticket.getTrainNumber()!=null) {
            ticket.setPnr("123456789");
        }
    ResponseEntity response =new ResponseEntity<>(ticket, HttpStatus.OK);
System.out.println(ticket.toString());
        return response;
    }

    return new ResponseEntity("notBooked", HttpStatus.BAD_REQUEST);

}

public String ticketBookedStatus(CheckNumber number){
    if(number.getPnr().equals("123456789")){
        return "booked";
    }return "not found";

}

}

