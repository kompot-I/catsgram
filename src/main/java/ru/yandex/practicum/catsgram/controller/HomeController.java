package ru.yandex.practicum.catsgram.controller;

import org.springframework.web.bind.annotation.*;
import ru.yandex.practicum.catsgram.model.Post;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/home")
public class HomeController {
    private final Map<Long, Post> posts = new HashMap<>();

    @GetMapping
    public String homePage(){
        return "<h1>Hi Kompot!<h1>";
    }
}
