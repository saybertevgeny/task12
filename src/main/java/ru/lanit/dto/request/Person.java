package ru.lanit.dto.request;

import ru.lanit.constraint.EntityState;
import ru.lanit.constraint.PersonStateConstraint;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class Person {

    @NotNull @Min(1) @PersonStateConstraint(existence = EntityState.NOT_EXIST)
    private long id;

    @NotBlank
    private String name;

    @NotNull @Past
    private LocalDate birthDay;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }
}
