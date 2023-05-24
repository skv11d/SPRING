package org.example.spring.quests;

import org.example.spring.interfaces.Quest;

public class EasyQuests implements Quest {

    @Override
    public void getQuest() {
        System.out.println("Easy quest received.");
    }

    @Override
    public void completeQuest() {
        System.out.println("Easy quest completed.");
    }
}
