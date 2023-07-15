package com.example.simplecrm;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InteractionController {

    // @Autowired
    private InteractionService interactionService;

    public InteractionController(InteractionService interactionService) {
        this.interactionService = interactionService;
    }

    // CRUD
    // 1. CREATE
    @PostMapping("/interactions")
    public ResponseEntity<Interaction> createInteraction(@RequestBody Interaction interaction) {
        Interaction newInteraction = interactionService.createInteraction(interaction);
        return new ResponseEntity<>(newInteraction, HttpStatus.CREATED);
    }

    // 2. READ (Get and Get All)
    // Get All Interactions
    @GetMapping("/interactions")
    public ResponseEntity<ArrayList<Interaction>> getAllInteractions() {
        ArrayList<Interaction> allInteractions = interactionService.getAllInteractions();
        return new ResponseEntity<>(allInteractions, HttpStatus.OK);
    }

    // Get Interaction
    @GetMapping("/interactions/{id}")
    public ResponseEntity<Interaction> getInteraction(@PathVariable int id) {
        Interaction foundInteraction = interactionService.getInteraction(id);
        return new ResponseEntity<>(foundInteraction, HttpStatus.OK);
    }

    // 3.UPDATE
    @PutMapping("/interactions/{id}")
    public ResponseEntity<Interaction> updateInteraction(@PathVariable int id, @RequestBody Interaction interaction) {
        Interaction updatedInteraction = interactionService.updateInteraction(id, interaction);
        return new ResponseEntity<>(updatedInteraction, HttpStatus.OK);
    }

    // 4. DELETE
    @DeleteMapping("/interactions/{id}")
    public ResponseEntity<HttpStatus> deleteInteraction(@PathVariable int id) {
        interactionService.deleteInteraction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
