package ru.ulmaridae.ch6springinaction.data;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.ulmaridae.ch6springinaction.Taco;

public interface TacoRepository extends PagingAndSortingRepository<Taco, Long> {
}
