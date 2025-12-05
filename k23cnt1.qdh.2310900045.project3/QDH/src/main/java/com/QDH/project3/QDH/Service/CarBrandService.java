package com.QDH.project3.QDH.Service;

import com.QDH.project3.QDH.Entity.CarBrand;
import com.QDH.project3.QDH.Repository.CarBrandRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CarBrandService {

    private final CarBrandRepository repository;

    public CarBrandService(CarBrandRepository repository) {
        this.repository = repository;
    }

    public List<CarBrand> getAllBrands() {
        return repository.findAll();
    }
}

