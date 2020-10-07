package ru.ulmaridae.ch6springinaction.data;

import ru.ulmaridae.ch6springinaction.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
