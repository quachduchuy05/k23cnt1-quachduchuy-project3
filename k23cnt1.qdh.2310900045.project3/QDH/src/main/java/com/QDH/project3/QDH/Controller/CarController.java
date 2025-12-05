package com.QDH.project3.QDH.Controller;

import com.QDH.project3.QDH.Entity.Car;
import com.QDH.project3.QDH.Service.CarService;
import com.QDH.project3.QDH.Service.CarBrandService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;
    private final CarBrandService brandService;

    @Value("${file.upload-dir}")
    private String uploadDir;

    public CarController(CarService carService, CarBrandService brandService) {
        this.carService = carService;
        this.brandService = brandService;
    }

    @GetMapping
    public String listCars(Model model) {
        List<Car> cars = carService.getAllCars();
        model.addAttribute("cars", cars);
        return "cars";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("car", new Car());
        model.addAttribute("brands", brandService.getAllBrands());
        return "car_form";
    }

    @PostMapping("/save")
    public String saveCar(@ModelAttribute Car car,
                          @RequestParam("imageFile") MultipartFile file) throws IOException {

        if (!file.isEmpty()) {
            String fileName = file.getOriginalFilename();
            file.transferTo(new File(uploadDir + "/" + fileName));
            car.setImage(fileName);
        }

        carService.saveCar(car);
        return "redirect:/cars";
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Integer id, Model model) {
        Car car = carService.getCarById(id).orElseThrow();
        model.addAttribute("car", car);
        model.addAttribute("brands", brandService.getAllBrands());
        return "car_form";
    }

    @GetMapping("/delete/{id}")
    public String deleteCar(@PathVariable Integer id) {
        carService.deleteCar(id);
        return "redirect:/cars";
    }
}

