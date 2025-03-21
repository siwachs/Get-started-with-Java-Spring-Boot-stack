package com.company.rest.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.company.rest.model.Person;

@Repository("postgres")
public class PersonDataAccessServiceDB implements PersonDao {

    @Override
    public int insertPerson(UUID id, Person person) {
        throw new UnsupportedOperationException("Unimplemented method 'insertPerson'");
    }

    @Override
    public List<Person> selectAllPeople() {
        return List.of(new Person(UUID.randomUUID(), "From POSTGRES DB"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        throw new UnsupportedOperationException("Unimplemented method 'selectPersonById'");
    }

    @Override
    public int deletePersonById(UUID id) {
        throw new UnsupportedOperationException("Unimplemented method 'deletePersonById'");
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        throw new UnsupportedOperationException("Unimplemented method 'updatePersonById'");
    }

}
