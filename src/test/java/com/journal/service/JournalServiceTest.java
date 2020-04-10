package com.journal.service;

import com.tutorhunt.journal.model.Journal;
import com.tutorhunt.journal.service.JournalService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JournalServiceTest {

    private JournalService journalService;

    @Before
    public void setUp() {
        journalService = new JournalService();
    }

    @Test
    public void shouldGetJournalReturnHelloWorld() {
        Journal journal = journalService.getJournal();

        assertEquals("Phill", journal.getName());
        assertEquals("28/03/2020", journal.getDate());
    }

    @Test
    public void shouldCreateJournalReturnsCreatedJournal() {
        Journal journal = new Journal();
        journal.setDate("28/03/2020");
        journal.setName("Phill");
        journalService.saveJournal(journal);
    }

}
