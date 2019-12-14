package pl.lewandowski.eventticketapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.lewandowski.eventticketapp.model.User;
import pl.lewandowski.eventticketapp.service.UserService;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping(value = "/get-all")
    public List<User> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(value = "/{id}")
    public User getUserById(@PathVariable Long id) {
        return service.getUserById(id);
    }

    @PostMapping(value = "/add")
    @ResponseStatus(code = HttpStatus.CREATED, reason = "User created!")
    public void addNewUser(@RequestBody User user) {
        service.addNewUser(user);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void removeUserById(@PathVariable Long id) {
        service.removeUserById(id);
    }
}
