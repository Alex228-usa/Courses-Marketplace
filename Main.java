package com.company;

import com.company.Bloggers.Blogger;
import com.company.subscribers.PersonOne;
import com.company.subscribers.PersonTwo;

public class Main {

    public static void main(String[] args) {
        Blogger editor = new Blogger();
        PersonOne personOne = new PersonOne("We are making new Course");
        PersonTwo personTwo = new PersonTwo("We are making new Course");
        editor.events.subscribe("makeNewCourse", personOne);
        editor.events.subscribe("makeNewCourse", personTwo);
        try {
            editor.makeNewCourse("You are invited to a new course with a 45 discount%");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("\n");
        editor.events.unsubscribe("makeNewCourse", personOne);
        try {
            editor.makeNewCourse("You are invited to a new course with a 45 discount%");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
