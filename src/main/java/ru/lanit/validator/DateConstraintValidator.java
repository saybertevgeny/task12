package ru.lanit.validator;

import ru.lanit.constraint.DateConstraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DateConstraintValidator implements ConstraintValidator<DateConstraint, LocalDate> {

    @Override
    public boolean isValid(LocalDate date, ConstraintValidatorContext constraintValidatorContext){
        return true;
    }
}
