package org.example.guestbook.controller;

import org.example.guestbook.domain.Guestbook;
import org.example.guestbook.repository.GuestbookRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/guestbooks")
@CrossOrigin(origins = "http://localhost:3000")
public class GuestbookController {

    private final GuestbookRepository guestbookRepository;

    public GuestbookController(GuestbookRepository guestbookRepository) {
        this.guestbookRepository = guestbookRepository;
    }

    @GetMapping
    public List<Guestbook> getGuestbooks() {
        return guestbookRepository.findAll();
    }

    @PostMapping
    public Guestbook createGuestbook(@RequestBody Guestbook guestbook) {
        return guestbookRepository.save(guestbook);
    }
}