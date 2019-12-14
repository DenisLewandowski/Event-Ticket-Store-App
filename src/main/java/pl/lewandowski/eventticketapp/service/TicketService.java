package pl.lewandowski.eventticketapp.service;

import org.springframework.stereotype.Service;
import pl.lewandowski.eventticketapp.model.Ticket;
import pl.lewandowski.eventticketapp.repository.TicketRepository;

import java.util.List;

@Service
public class TicketService {

    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).orElse(null);
    }

    public void addNewTicket(Ticket ticket) {
        ticketRepository.save(ticket);
    }

    public void removeTicketById(Long id) {
        ticketRepository.deleteById(id);
    }
}
