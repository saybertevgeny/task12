package ru.lanit.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ru.lanit.constraint.EntityState;
import ru.lanit.constraint.PersonStateConstraint;
import ru.lanit.dto.desirializer.LocalDateDeserialize;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.time.LocalDate;

public class Person {

    @NotNull
    @PersonStateConstraint(existence = EntityState.NOT_EXIST)
    private long id;

    @NotNull
    private String name;

    @NotNull
    @Past
    @JsonDeserialize(using = LocalDateDeserialize.class, as = LocalDate.class)
    private LocalDate birthdate;

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

    public LocalDate getBirthDate() {
        return birthdate;
    }

    public void setBirthDate(LocalDate birthDay) {
        this.birthdate = birthDay;
    }
}
