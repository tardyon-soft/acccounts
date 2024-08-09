package ru.tardyon.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tardyon.account.model.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
