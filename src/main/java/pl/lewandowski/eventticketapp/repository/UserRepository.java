package pl.lewandowski.eventticketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.lewandowski.eventticketapp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
