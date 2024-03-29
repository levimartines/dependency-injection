package com.levimartines.depinjection.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile(value = {"en","default"})
public class PrimaryGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello - 1ST ONE HERE BEATCHES";
    }
}
