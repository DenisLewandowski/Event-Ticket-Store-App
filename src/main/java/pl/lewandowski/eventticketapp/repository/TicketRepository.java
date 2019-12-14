package pl.lewandowski.eventticketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lewandowski.eventticketapp.model.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
