package org.example.spring.quests;

import org.example.spring.interfaces.Quest;

public class MediumQuests implements Quest {

    @Override
    public void getQuest() {
        System.out.println("Medium quest received.");
    }

    @Override
    public void completeQuest() {
        System.out.println("Medium quest completed.");
    }
}
