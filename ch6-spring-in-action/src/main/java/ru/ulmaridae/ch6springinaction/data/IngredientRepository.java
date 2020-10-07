package ru.ulmaridae.ch6springinaction.data;

import org.springframework.data.repository.CrudRepository;
import ru.ulmaridae.ch6springinaction.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}