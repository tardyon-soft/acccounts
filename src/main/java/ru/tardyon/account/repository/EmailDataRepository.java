package ru.tardyon.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tardyon.account.model.EmailData;

import java.util.Optional;

public interface EmailDataRepository extends JpaRepository<EmailData, Long> {
    Optional<EmailData> findByEmail(String email);
}
