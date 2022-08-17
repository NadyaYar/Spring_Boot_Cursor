package com.example.demo.UUID;

import java.util.ArrayList;
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

    @GetMapping("/uuid")
    public List<UUID> getUuidList(@RequestParam("number") int size) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            uuids.add(uuidService.getUUID());
        }
        return uuids;
    }
}

