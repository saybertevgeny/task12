package ru.lanit.validator;

import org.springframework.beans.factory.annotation.Autowired;
import ru.lanit.Exception.NoEntityException;
import ru.lanit.constraint.PersonAgeConstraint;
import ru.lanit.service.PersonService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PersonAgeValidator implements ConstraintValidator<PersonAgeConstraint,Long>{

    private PersonAgeConstraint constraint;
    private PersonService personService;

    @Autowired
    public PersonAgeValidator(PersonService personService){
        this.personService = personService;
    }

    @Override
    public void initialize(PersonAgeConstraint constraint) {
        this.constraint = constraint;
    }

    @Override
    public boolean isValid(Long id, ConstraintValidatorContext constraintValidatorContext) {
        try {
            return personService.getById(id).getAge() > constraint.minAge();
        }
        catch (NoEntityException e) {
            return false;
        }
    }
}
