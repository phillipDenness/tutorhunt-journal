package com.tutorhunt.journal.controller;

import com.tutorhunt.journal.model.Journal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tutorhunt.journal.service.JournalService;

@RestController
public class JournalController {

    @Autowired
    private JournalService service;

    @PostMapping("/journal")
    public ResponseEntity createJournal(Journal request) {
        service.saveJournal(request);

        return ResponseEntity.ok().body("");
    }

    @GetMapping("/journal")
    public ResponseEntity getJournal() {
        Journal journal = service.getJournal();

        return ResponseEntity.ok().body("");
    }
}
