package com.company.rest.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.company.rest.model.Person;

@Repository("postgres")
public class PersonDataAccessServiceDB implements PersonDao {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    PersonDataAccessServiceDB(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public int insertPerson(UUID id, Person person) {
        return 0;
    }

    @Override
    public List<Person> selectAllPeople() {
        final String sql = "SELECT id, name FROM person";

        return jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID id = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");

            return new Person(id, name);
        });
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        final String sql = "SELECT id, name FROM person WHERE id = ?";

        List<Person> people = jdbcTemplate.query(sql, (resultSet, i) -> {
            UUID personId = UUID.fromString(resultSet.getString("id"));
            String name = resultSet.getString("name");

            return new Person(personId, name);
        });

        return people.stream().findFirst();
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
