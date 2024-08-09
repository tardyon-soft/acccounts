package ru.tardyon.account.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.tardyon.account.model.PhoneData;
import ru.tardyon.account.repository.PhoneDataRepository;
import ru.tardyon.account.service.PhoneService;


@Service
@AllArgsConstructor
public class PhoneServiceImpl implements PhoneService {

    private PhoneDataRepository repository;

    @Override
    public PhoneData findByPhone(String phoneOrEmail) {
        var result = repository.findByPhone(phoneOrEmail);
        return result.orElse(null);
    }
}
