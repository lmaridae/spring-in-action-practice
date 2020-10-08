package ru.ulmaridae.ch6springinaction.web;

import java.util.List;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.hateoas.server.EntityLinks;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;
import ru.ulmaridae.ch6springinaction.Order;
import ru.ulmaridae.ch6springinaction.Taco;
import ru.ulmaridae.ch6springinaction.Ingredient;
import ru.ulmaridae.ch6springinaction.Ingredient.Type;
import ru.ulmaridae.ch6springinaction.data.TacoRepository;

@Slf4j
@RestController
@RequestMapping(path = "/design", produces = "application/json")
@CrossOrigin(origins = "*")
public class DesignTacoController {

    private TacoRepository tacoRepository;

    @Autowired
    EntityLinks entityLinks;

    @Autowired
    public DesignTacoController(TacoRepository designRepo) {
        this.tacoRepository = designRepo;
    }

    @GetMapping("/recent")
    public Iterable<Taco> recentTacos() {
        PageRequest page = PageRequest.of(
                0, 12, Sort.by("createdAt").descending());
        return tacoRepository.findAll(page).getContent();
    }
}

