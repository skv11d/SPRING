package org.example.spring.quests;

import org.example.spring.interfaces.Quest;

public class HardQuests implements Quest {

    @Override
    public void getQuest() {
        System.out.println("Hard quest received.");
    }

    @Override
    public void completeQuest() {
        System.out.println("ard quest completed.");
    }
}
