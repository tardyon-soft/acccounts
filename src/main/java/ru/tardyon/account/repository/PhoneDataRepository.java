package ru.tardyon.account.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.tardyon.account.model.PhoneData;

import java.util.Optional;

public interface PhoneDataRepository extends JpaRepository<PhoneData, Long> {
    Optional<PhoneData> findByPhone(String phone);
}
