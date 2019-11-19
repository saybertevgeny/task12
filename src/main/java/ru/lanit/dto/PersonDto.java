package ru.lanit.dto;

import java.time.LocalDate;
import java.time.Period;

public class PersonDto {

    private long id;

    private String name;

    private LocalDate birthDay;

    public PersonDto(long id, String name, LocalDate birthDay) {
        this.id = id;
        this.name = name;
        this.birthDay = birthDay;
    }

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

    public int getAge(){
        return Period.between(birthDay,LocalDate.now()).getYears();
    }
}
