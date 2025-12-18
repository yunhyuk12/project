package org.example.guestbook.repository;

import org.example.guestbook.domain.Guestbook;  // ⭐ 이 줄이 핵심
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestbookRepository
        extends JpaRepository<Guestbook, Long> {
}
