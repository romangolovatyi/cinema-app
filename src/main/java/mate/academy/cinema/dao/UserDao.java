package mate.academy.cinema.dao;

import java.util.Optional;
import mate.academy.cinema.model.User;

public interface UserDao {
    User add(User user);

    Optional<User> get(Long id);

    Optional<User> findByEmail(String email);
}
