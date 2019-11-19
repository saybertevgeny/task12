package ru.lanit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.lanit.Exception.NoEntityException;
import ru.lanit.dto.PersonDto;
import ru.lanit.entity.Person;
import ru.lanit.repository.PersonRepositoryInterface;

@Component
public class PersonService {

    private PersonRepositoryInterface personRepository;

    @Autowired
    public PersonService(PersonRepositoryInterface personRepository) {
        this.personRepository = personRepository;
    }

    public boolean existPerson(long id) {
        return personRepository.existsById(id);
    }

    public PersonDto getById(long id) throws NoEntityException {
        Person person = personRepository.findById(id).orElseThrow(() -> new NoEntityException());
        return new PersonDto(person.getId(), person.getName(), person.getBirthDay());
    }

    public void save(ru.lanit.dto.request.Person requestPerson) {
        Person person = new Person();
        person.setBirthDay(requestPerson.getBirthDay())
                .setName(requestPerson.getName())
                .setId(requestPerson.getId());
        personRepository.save(person);
    }

}
