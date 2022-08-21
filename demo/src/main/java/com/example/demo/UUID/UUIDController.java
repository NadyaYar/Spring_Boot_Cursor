package com.example.demo.UUID;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UUIDController {

    private final UUIDService uuidService;

    @Autowired
    public UUIDController(UUIDService uuidService) {
        this.uuidService = uuidService;
    }

    @GetMapping("/uuids")
    public List<UUID> getUuidsList(@RequestParam("number") int size) {
        return uuidService.getUUIDs(size);
    }
}

