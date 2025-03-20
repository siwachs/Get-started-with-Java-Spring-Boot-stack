package com.company.rest.dao;

import java.util.List;
import java.util.Optional;
import java.util.ArrayList;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.company.rest.model.Person;

@Repository("personDao")
public class PersonDataAccessService implements PersonDao {
    private static List<Person> db = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        db.add(new Person(id, person.getName()));
        return 1;
    }

    @Override
    public List<Person> selectAllPeople() {
        return db;
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        return db.stream().filter(person -> person.getId().equals(id)).findFirst();
    }

    @Override
    public int deletePersonById(UUID id) {
        Optional<Person> person = selectPersonById(id);
        if (person.isEmpty())
            return 0;

        db.remove(person.get());
        return 1;
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        return selectPersonById(id).map(p -> {
            int indexOfPersonToUpdate = db.indexOf(person);
            if (indexOfPersonToUpdate >= 0) {
                db.set(indexOfPersonToUpdate, person);
                return 1;
            }

            return 0;
        }).orElse(0);
    }
}
