package ru.lanit.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.lanit.service.PersonService;

import javax.validation.Valid;

@RestController
public class PersonController {

    private PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @RequestMapping(value = "/person", method = RequestMethod.POST)
    public ResponseEntity save(@RequestBody @Valid ru.lanit.dto.request.Person personDto) {
        personService.save(personDto);
        return ResponseEntity.ok().build();
    }
}
