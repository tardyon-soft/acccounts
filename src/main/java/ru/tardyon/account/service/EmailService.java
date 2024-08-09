package ru.tardyon.account.service;

import ru.tardyon.account.model.EmailData;

public interface EmailService {
    EmailData findByEmail(String phoneOrEmail);
}
