package com.company.subscribers;


public class PersonOne implements Subscribers{
    private final String data;
    public PersonOne(String data) {
        this.data = data;
    }

    @Override
    public void mailing(String eventType, String data) {
        System.out.println(data + " : " + eventType + " : " + data);
    }
}
