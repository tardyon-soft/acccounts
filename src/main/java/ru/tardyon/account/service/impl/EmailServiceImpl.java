package ru.tardyon.account.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tardyon.account.model.EmailData;
import ru.tardyon.account.repository.EmailDataRepository;
import ru.tardyon.account.service.EmailService;

@Service
@AllArgsConstructor
public class EmailServiceImpl implements EmailService {

    private EmailDataRepository repository;

    @Override
    public EmailData findByEmail(String phoneOrEmail) {
        var result = repository.findByEmail(phoneOrEmail);
        return result.orElse(null);
    }
}
