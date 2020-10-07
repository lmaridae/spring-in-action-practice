package ru.ulmaridae.ch6springinaction.web;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import ru.ulmaridae.ch6springinaction.Ingredient;
import ru.ulmaridae.ch6springinaction.data.IngredientRepository;

@Slf4j
@Component
public class IngredientByIdConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    @Autowired
    public IngredientByIdConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String id) {
//        log.info("convert: " + id);
        return ingredientRepository.findById(id).orElse(null);
    }
}
