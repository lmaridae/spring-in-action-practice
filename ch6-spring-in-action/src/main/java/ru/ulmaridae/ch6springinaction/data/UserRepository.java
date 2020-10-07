package ru.ulmaridae.ch6springinaction.data;

import org.springframework.data.repository.CrudRepository;
import ru.ulmaridae.ch6springinaction.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
