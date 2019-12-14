package pl.lewandowski.eventticketapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.lewandowski.eventticketapp.model.Ticket;
import pl.lewandowski.eventticketapp.service.TicketService;

import java.util.List;

@RestController
@RequestMapping(value = "/ticket")
public class TicketController {

    private final TicketService service;

    public TicketController(TicketService service) {
        this.service = service;
    }

    @GetMapping(value = "/get-all")
    public List<Ticket> getAllTickets() {
        return service.getAllTickets();
    }

    @GetMapping(value = "/{id}")
    public Ticket getTicketById(@PathVariable Long id) {
        return service.getTicketById(id);
    }

    @PostMapping(value = "/add")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Ticket created!")
    public void addNewTicket(@RequestBody Ticket ticket) {
        service.addNewTicket(ticket);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void removeTicketById(@PathVariable Long id) {
        service.removeTicketById(id);
    }
}
