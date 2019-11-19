package ru.lanit.repository;

import org.springframework.data.repository.CrudRepository;
import ru.lanit.entity.Car;

public interface CarRepositoryInterface extends CrudRepository<Car,Long> {
}
