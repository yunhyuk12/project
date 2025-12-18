package org.example.guestbook.controller;

import org.example.guestbook.domain.Guestbook;
import org.example.guestbook.repository.GuestbookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guestbooks")
@CrossOrigin(origins = "http://localhost:3000")
public class GuestbookController {

    private final GuestbookRepository repository;

    public GuestbookController(GuestbookRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Guestbook> findAll() {
        return repository.findAll();
    }

    @PostMapping
    public void save(@RequestBody Guestbook request) {
        repository.save(
                new Guestbook(request.getNickname(), request.getContent())
        );
    }
}

