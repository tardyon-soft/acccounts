package ru.tardyon.account.service;

import ru.tardyon.account.model.PhoneData;

public interface PhoneService {
    PhoneData findByPhone(String phoneOrEmail);
}
