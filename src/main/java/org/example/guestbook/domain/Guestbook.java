package org.example.guestbook.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.time.LocalDateTime;

@Entity
public class Guestbook {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String content;

    private LocalDateTime createdAt = LocalDateTime.now();

    protected Guestbook() {}

    public Guestbook(String nickname, String content) {
        this.nickname = nickname;
        this.content = content;
    }

    public Long getId() { return id; }
    public String getNickname() { return nickname; }
    public String getContent() { return content; }
}
