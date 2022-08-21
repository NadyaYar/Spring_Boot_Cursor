package com.example.demo.UUID;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;

@Service
public class UUIDService {

    public List<UUID> getUUIDs(int size) {
        List<UUID> uuids = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            uuids.add(UUID.randomUUID());
        }
        return uuids;
    }
}

