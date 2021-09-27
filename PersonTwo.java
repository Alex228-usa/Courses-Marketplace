package com.company.subscribers;

public class PersonTwo implements Subscribers{
    private final String data;
    public PersonTwo(String data) {
        this.data = data;
    }

    @Override
    public void mailing(String eventType, String data) {
        System.out.println(data + " : "+ eventType + " : " + data);
    }
}
