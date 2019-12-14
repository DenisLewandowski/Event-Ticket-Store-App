package pl.lewandowski.eventticketapp.service;

import org.springframework.stereotype.Service;
import pl.lewandowski.eventticketapp.model.User;
import pl.lewandowski.eventticketapp.repository.UserRepository;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public void addNewUser(User user) {
        userRepository.save(user);
    }

    public void removeUserById(Long id) {
        userRepository.deleteById(id);
    }
}
