package org.example.spring;

import org.example.spring.heroes.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("context.xml");
        Knight knight = (Knight) ctx.getBean("knight", Knight.class);
        knight.getQuest().getQuest();
        knight.getQuest().completeQuest();
    }
}