package com.salaheddine.schoolboot.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import com.salaheddine.schoolboot.model.Contact;

@Slf4j
@Service
public class ContactService {
    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }
}
