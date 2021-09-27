package com.company.Bloggers;

import com.company.Producer.EventManager;


public class Blogger {
    public EventManager events;
    private String data;

    public Blogger() {
        this.events = new EventManager("makeNewCourse");
    }

    public void makeNewCourse(String data) {
        this.data = new String(data);
        events.notify("makeNewCourse", data);
    }
}
