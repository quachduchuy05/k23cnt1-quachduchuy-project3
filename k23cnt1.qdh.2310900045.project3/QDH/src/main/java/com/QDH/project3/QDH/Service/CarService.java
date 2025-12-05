package com.QDH.project3.QDH.Service;

import com.QDH.project3.QDH.Entity.Car;
import com.QDH.project3.QDH.Repository.CarRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }

    public List<Car> getAllCars() { return repository.findAll(); }

    public Optional<Car> getCarById(Integer id) { return repository.findById(id); }

    public Car saveCar(Car car) { return repository.save(car); }

    public void deleteCar(Integer id) { repository.deleteById(id); }
}

