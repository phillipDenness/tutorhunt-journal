package com.tutorhunt.journal.service;

import com.tutorhunt.journal.model.Journal;
import org.springframework.stereotype.Component;

@Component
public class JournalService {
    public void saveJournal(Journal request) {
    }

    public Journal getJournal() {
        Journal journal = new Journal();
        journal.setDate("28/03/2020");
        journal.setName("Phill");
        return journal;
    }
}
