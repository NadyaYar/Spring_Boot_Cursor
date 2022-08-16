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

    @Autowired
    private UUIDService uuidService;

    @GetMapping("/uuids")
    public List<UUID> uuids(@RequestParam("number") int number) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            uuids.add(uuidService.getUUIDs());
        }
        return uuids;
    }
}

