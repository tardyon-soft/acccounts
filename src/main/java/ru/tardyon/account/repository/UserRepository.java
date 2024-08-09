package ru.tardyon.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import ru.tardyon.account.model.User;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor {
}
