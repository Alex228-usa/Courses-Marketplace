package com.company.Producer;

import com.company.subscribers.Subscribers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<Subscribers>> subscribers = new HashMap<>();
    public EventManager(String... operations) {
        for (String operation : operations) {
            this.subscribers.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Subscribers listener) {
        List<Subscribers> users = subscribers.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, Subscribers listener) {
        List<Subscribers> users = subscribers.get(eventType);
        users.remove(listener);
    }

    public void notify(String eventType, String data) {
        List<Subscribers> users = subscribers.get(eventType);
        for (Subscribers subscriber : users) {
            subscriber.mailing(eventType, data);
        }
    }
}
