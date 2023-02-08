package com.salaheddine.schoolboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.salaheddine.schoolboot.model.Contact;
import org.springframework.web.context.annotation.ApplicationScope;

@Slf4j
@Service
@ApplicationScope
public class ContactService {
    private int counter = 0;
    public ContactService() {
        System.out.println("Contact Bean initialized");
    }
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
