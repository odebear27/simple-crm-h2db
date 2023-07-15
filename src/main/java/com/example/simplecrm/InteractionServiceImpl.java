package com.example.simplecrm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InteractionServiceImpl implements InteractionService {

    // @Autowired
    private InteractionRepository interactionRepository;

    public InteractionServiceImpl(InteractionRepository interactionRepository) {
        this.interactionRepository = interactionRepository;
    }

    // Create
    @Override
    public Interaction createInteraction(Interaction interaction) {
        Interaction newInteraction = interactionRepository.save(interaction);
        return newInteraction;
    }

    // Get One
    @Override
    public Interaction getInteraction(int id) {
        Interaction foundInteraction = interactionRepository.findById(id).get();
        return foundInteraction;
    }

    // Get All
    @Override
    public ArrayList<Interaction> getAllInteractions() {
        List<Interaction> allInteractions = interactionRepository.findAll();
        return (ArrayList<Interaction>) allInteractions;
    }

    // Update
    @Override
    public Interaction updateInteraction(int id, Interaction interaction) {
        Interaction interactionToUpdate = interactionRepository.findById(id).get();

        interactionToUpdate.setRemarks(interaction.getRemarks());
        interactionToUpdate.setInteractionDate(interaction.getInteractionDate());

        return interactionRepository.save(interactionToUpdate);
    }

    // Delete
    @Override
    public void deleteInteraction(int id) {
        interactionRepository.deleteById(id);
    }
}
