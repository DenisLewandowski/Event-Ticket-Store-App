package pl.lewandowski.eventticketapp.service;

import org.springframework.stereotype.Service;
import pl.lewandowski.eventticketapp.model.Event;
import pl.lewandowski.eventticketapp.repository.EventRepository;

import java.util.List;

@Service
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public List<Event> getEvents() {
        return eventRepository.findAll();
    }

    public Event getEventById(Long id) {
        return eventRepository.findById(id).orElse(null);
    }

    public void addNewEvent(Event event) {
        eventRepository.save(event);
    }

    public void removeEventById(Long id) {
        eventRepository.deleteById(id);
    }

}
