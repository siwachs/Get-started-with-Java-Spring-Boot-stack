package com.company.rest.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.company.rest.model.Person;

public interface PersonDao {
    int insertPerson(UUID id, Person person);

    default int addPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

    List<Person> selectAllPeople();

    Optional<Person> selectPersonById(UUID id);

    int deletePersonById(UUID id);

    int updatePersonById(UUID id, Person person);
}
