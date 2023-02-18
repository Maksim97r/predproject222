package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarService;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarService carService;
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", carService.findNCars(count));
        return "cars";
    }
}