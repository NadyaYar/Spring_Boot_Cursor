package com.example.demo.UUID;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class UUIDService {
    public UUID getUUIDs() {
        return UUID.randomUUID();
    }
}
