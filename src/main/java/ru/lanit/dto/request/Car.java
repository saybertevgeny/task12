package ru.lanit.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import ru.lanit.constraint.CarStateConstraint;
import ru.lanit.constraint.PersonAgeConstraint;
import ru.lanit.constraint.EntityState;
import ru.lanit.constraint.PersonStateConstraint;
import ru.lanit.dto.Model;
import ru.lanit.dto.desirializer.ModelDeserialize;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Car {

    @NotNull @Min(1) @CarStateConstraint(existence = EntityState.NOT_EXIST)
    private long id;

    @NotNull
    @JsonDeserialize(using = ModelDeserialize.class, as = Model.class)
    private Model model;

    @NotNull
    @Min(0)
    private int horsepower;

    @NotNull
    @PersonStateConstraint(existence = EntityState.EXIST)
    @PersonAgeConstraint(minAge = 18)
    private long ownerId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public long getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(long ownerId) {
        this.ownerId = ownerId;
    }
}
