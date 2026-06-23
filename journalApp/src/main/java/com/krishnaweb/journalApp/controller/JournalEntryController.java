package com.krishnaweb.journalApp.controller;

import com.krishnaweb.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
    private Map<Long ,JournalEntry> journalEntries = new HashMap<>();

     @GetMapping
    public List<JournalEntry> getAll(){ // localhost:8080
  return  new ArrayList<>(journalEntries.values());
    }

     @PostMapping
    public void createEntry(){

    }


}
