package com.example.simplecrm;

import java.util.ArrayList;

public interface InteractionService {
    Interaction createInteraction(Interaction interaction);

    public Interaction getInteraction(int id);

    public ArrayList<Interaction> getAllInteractions();

    public Interaction updateInteraction(int id, Interaction interaction);

    public void deleteInteraction(int id);
}
