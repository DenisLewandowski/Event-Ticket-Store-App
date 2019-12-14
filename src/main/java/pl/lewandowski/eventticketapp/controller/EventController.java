package pl.lewandowski.eventticketapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.lewandowski.eventticketapp.model.Event;
import pl.lewandowski.eventticketapp.service.EventService;

import java.util.List;

@RestController
@RequestMapping(value = "api/event")
public class EventController {

    private final EventService service;

    public EventController(EventService service) {
        this.service = service;
    }

    @GetMapping(value = "/get-all")
    public List<Event> getAllEvents() {
        return service.getEvents();
    }

    @GetMapping(value = "/{id}")
    public Event getEventById(@PathVariable Long id) {
        return service.getEventById(id);
    }

    @PostMapping(value = "/add")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "Event created!")
    public void addNewEvent(@RequestBody Event event) {
        service.addNewEvent(event);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void removeEventById(@PathVariable Long id) {
        service.removeEventById(id);
    }
}
