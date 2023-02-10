package com.salaheddine.schoolboot.service;


import com.salaheddine.schoolboot.constants.EazySchoolConstants;
import com.salaheddine.schoolboot.model.Person;
import com.salaheddine.schoolboot.model.Roles;
import com.salaheddine.schoolboot.repository.PersonRepository;
import com.salaheddine.schoolboot.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;
    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(EazySchoolConstants.STUDENT_ROLE);
        person.setRoles(role);
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}