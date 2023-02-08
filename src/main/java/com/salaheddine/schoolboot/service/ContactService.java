package com.salaheddine.schoolboot.service;

import com.salaheddine.schoolboot.constants.EazySchoolConstants;
import com.salaheddine.schoolboot.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salaheddine.schoolboot.model.Contact;
import org.springframework.web.context.annotation.ApplicationScope;

import java.time.LocalDateTime;

@Slf4j
@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;

    public boolean saveMessageDetails(Contact contact) {
        boolean isSaved = false;
        contact.setStatus(EazySchoolConstants.OPEN);
        contact.setCreatedBy(EazySchoolConstants.ANONYMOUS);
        contact.setCreatedAt(LocalDateTime.now());
        int result = contactRepository.saveContactMsg(contact);
        if(result>0) {
            isSaved = true;
        }
        return isSaved;
    }
}
