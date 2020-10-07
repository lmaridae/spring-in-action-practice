package ru.ulmaridae.ch6springinaction.data;

import org.springframework.data.repository.CrudRepository;
import ru.ulmaridae.ch6springinaction.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
}
